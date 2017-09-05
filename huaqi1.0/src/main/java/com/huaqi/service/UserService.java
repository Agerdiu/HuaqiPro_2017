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

}
