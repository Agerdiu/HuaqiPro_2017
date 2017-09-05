package com.huaqi.controller;

import com.huaqi.bean.Msg;
import com.huaqi.bean.User;
import com.huaqi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.naming.Binding;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes(value={"currentUser","password"})
public class UserController {

    @Autowired
    UserService userService;

    //检查Id是否可用
    @RequestMapping(value = "/checkId")
    @ResponseBody
    public Msg checkId(@RequestParam("id") String id)
    {
        String regx="\\d{17}(\\d|x)";
        if(!id.matches(regx))
            return Msg.fail().add("va_msg","必须是正确身份证号如无身份证请自创18位数字ID");

        //数据库校验
        boolean b=userService.checkId(id);
        if(b)
            return Msg.success();
        else
            return Msg.fail().add("va_msg","号码已注册");

    }

    //登录
    @RequestMapping(value="/login",method = RequestMethod.POST)
    @ResponseBody
    public Msg login(@RequestParam("id") String id,@RequestParam("password") String password, ModelMap model)
    {
        boolean b=userService.checkLogin(id,password);
        if(b)
        {
            model.put("currentUser",id);
            model.put("password",password);
            return Msg.success();
        }
        else
            return Msg.fail();
    }

    //注册
    @RequestMapping(value="/register",method = RequestMethod.POST)
    @ResponseBody
    public Msg register(@Valid User user, BindingResult result)
    {
        if(result.hasErrors())
        {
            List<FieldError> errors=result.getFieldErrors();
            Map<String ,Object> map=new HashMap<>();
            for(FieldError fieldError:errors)
            {
                System.out.println("错误的字段名:"+fieldError.getField());
                System.out.println("错误信息:"+fieldError.getDefaultMessage());
                map.put(fieldError.getField(),fieldError.getDefaultMessage());
            }
            return Msg.fail().add("errorFields",map);
        }
        else
        {
            userService.saveRegInfo(user);
            return Msg.success();
        }
    }
}
