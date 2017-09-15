package com.huaqi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.huaqi.bean.Msg;
import com.huaqi.bean.User;
import com.huaqi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.naming.Binding;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes(value={"currentUser","currentPassword","currentUserName"})
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

    //退出登录
    @RequestMapping(value = "/loginOut")
    public String loginOut(SessionStatus status)
    {
        status.setComplete();
        return "/index";
    }

    //获取员工信息
    @RequestMapping(value = "/getUserInfo")
    @ResponseBody
    public Msg getUserInfo(@ModelAttribute("currentUser")String currentUser)
    {
       String userName;
       String maritalStatus;
       String email;
       String tel;
       String gender;
       String id=currentUser;
       User user=userService.getUserInfo(id);
       userName=user.getUserName();
       maritalStatus=user.getMaritalStatus()==0?"未婚":user.getMaritalStatus()==2?"离婚":user.getMaritalStatus()==3?"已婚":"不明";
       email=user.getEmail();
       tel=user.getTel();
       gender=user.getGender();
       Map<String ,Object> map=new HashMap<>();
       map.put("userName",userName);
       map.put("maritalStatus",maritalStatus);
       map.put("email",email);
       map.put("tel",tel);
       map.put("gender",gender);
       return Msg.fail().add("userInfo",map);
    }

    //登录
    @RequestMapping(value="/login",method = RequestMethod.POST)
    @ResponseBody
    public Msg login(@RequestParam("id") String id,@RequestParam("password") String password, ModelMap model)
    {
        boolean b=userService.checkLogin(id,password);
        if(b)
        {
            User user=userService.getUserInfo(id);
            model.put("currentUserName",user.getUserName());
            model.put("currentUser",id);
            model.put("currentPassword",password);
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

    //修改信息
    @RequestMapping(value="/changeInfo",method = RequestMethod.POST)
    @ResponseBody
    public Msg saveUser(@ModelAttribute("currentUser")String currentUser,/*,@RequestParam("userName") String userName,
                        @RequestParam("password") String password, @RequestParam("gender") String gender,
                        @RequestParam("email") String email, @RequestParam("tel") String tel*/User user)
    {
        //System.out.println(user.getUserName());
        userService.update(currentUser,user);
        return Msg.success();
    }

    @RequestMapping(value="/evaluate_common",method = RequestMethod.POST)
    @ResponseBody
    public Msg updateUser(@ModelAttribute("currentUser")String currentUser, double majorExpenditure1,User user)

    {
        System.out.print("entered");

        userService.update(currentUser,user);
        user = userService.evaluate(currentUser);
        userService.update(currentUser,user);
        return Msg.success();
    }

    @RequestMapping(value="/evaluateResult",method = RequestMethod.GET)
    @ResponseBody
    public String evaluateResult(@ModelAttribute("currentUser")String currentUser)
    {
        User a ;
        ObjectMapper mapper = new ObjectMapper();
        a = userService.getUserInfo(currentUser);
        try{ String result = mapper.writeValueAsString(a);
            System.out.println(result);
            return result;}
        catch(Exception e){
            System.out.println("dumperror");
        }
        return "error";
    }

    /*******页面跳转逻辑部分*******/
    //主页
    @RequestMapping(value="/indexPage")
    public String GoIndex()
    {
        return "/index";
    }

    //更改信息
    @RequestMapping(value="/changeInfoPage")
    public String GoChangeInfo()
    {
        return "/changeInfo";
    }

    //关于我们
    @RequestMapping(value="/aboutPage")
    public String GoAbout()
    {
        return "/about";
    }

    //登录
    @RequestMapping(value="/loginPage")
    public String GoLogin()
    {
        return "/login";
    }

    //注册
    @RequestMapping(value="/registerPage")
    public String GoRegister()
    {
        return "/register";
    }

    //评估样例
    @RequestMapping(value="/evaluate-examplePage")
    public String GoEvaluateExample()
    {
        return "/evaluate-example";
    }

    //评估
    @RequestMapping(value="/evaluatePage")
    public String GoEvaluate()
    {
        return "/evaluate";
    }

    //评估农民
    @RequestMapping(value="/evaluate-farmerPage")
    public String GoEvaluateFarmer()
    {
        return "/evaluate-farmer";
    }

    //评估商人
    @RequestMapping(value="/evaluate-businessmanPage")
    public String GoEvaluateBusinessman()
    {
        return "/evaluate-businessman";
    }

    //评估工薪户
    @RequestMapping(value="/evaluate-salarymanPage")
    public String GoEvaluateSalaryman()
    {
        return "/evaluate-salaryman";
    }

    //评估结果
    @RequestMapping(value="/evaluate-resultPage")
    public String GoEvaluateResult()
    {
        return "/evaluate-result";
    }
    /*******页面跳转逻辑部分*******/
}
