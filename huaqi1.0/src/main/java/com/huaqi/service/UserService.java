package com.huaqi.service;

import com.huaqi.bean.User;
import com.huaqi.bean.UserExample;
import com.huaqi.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    //保存注册信息
    public void saveRegInfo(User user)
    {
        userMapper.insertSelective(user);
    }

    //检查id是否重复,true代表无重复，false为有重复
    public boolean checkId(String id)
    {
        UserExample example=new UserExample();
        UserExample.Criteria criteria= example.createCriteria();
        criteria.andIdEqualTo(id);
        long count=userMapper.countByExample(example);
        return count==0;
    }

    //检查登录信息与数据库比对
    public boolean checkLogin(String id,String password)
    {
        UserExample example=new UserExample();
        UserExample.Criteria criteria= example.createCriteria();
        criteria.andIdEqualTo(id);
        criteria.andPasswordEqualTo(password);
        long count=userMapper.countByExample(example);
        return count==1;
    }

    //获取当前User
    public User getUserInfo(String id)
    {
        return userMapper.selectByPrimaryKey(id);
    }

    public User evaluate(String currentuser)
    {
        double score = 0.0;
        System.out.print("called");
        User user = userMapper.selectByPrimaryKey(currentuser);
        switch(user.getUserType())
        {
            case"farmer":
                System.out.print("farmer called");
                user.setPaydebtSystemScore(200.0);
                user.setPaydebtAbilityScore(score);
                user.setPaydebtPotentialScore(score);
                break;
            case"businessman": break;
            case"salaryman": break;
        }
        user.setPaydebtAbilityLevel(Sort(user.getPaydebtAbilityScore()));
        user.setPaydebtPotentialLevel(Sort(user.getPaydebtPotentialScore()));
        user.setPaydebtSystemLevel(Sort(user.getPaydebtSystemScore()));
        return user;
    }

    //更新信息
    public void update(String id,User user/*String id,String userName,String password,String gender,String email,String tel*/)
    {
        user.setId(id);
        userMapper.updateByPrimaryKeySelective(user);
        return;
    }
    public String Sort(double i)
    {
        if(i < 55) return "D";
        else if(i < 110) return "C";
        else if(i < 165) return"CC";
        else if(i < 220) return"CCC";
        else if(i < 275) return"B";
        else if(i < 330) return"BB";
        else if(i < 385) return"BBB";
        else if(i < 440) return"A";
        else if(i < 495) return"AA";
        else return"AAA";
    }
}
