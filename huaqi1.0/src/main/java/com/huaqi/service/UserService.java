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
        score = 550 * ((1+user.getVillageCadres())*0.006 + (1+user.getHonor())*0.0068 + (1+user.getElderLive())*0.0073 + (1+user.getGuarantee())*0.0073
                +(1+user.getArrearage())*0.0230 + (1+user.getBadActions())*0.0466 + (1+user.getLayPayment())*0.0215 + (1+user.getInformationLevel())*0.0062
                + (1+user.getLoanGuaratee())*0.0311 + (1+user.getPersonalInsurance())*0.2169 + (1+user.getHealthExamination())*0.2169 + (user.getPrivateLending()+1)*0.1548
                + (1+user.getMarried())*0.0233 + (1+user.getPhoneNumReplace())*0.0480 + (1+user.getResidenceTime())*0.1841 );
        user.setPaydebtSystemScore(score);
        switch(user.getUserType())
        {
            case"farmer":
                System.out.print("farmer called");
                score = 550*((1+user.getAgriculturalEquip())*0.0238 + (1+user.getHouseValue())*0.3877 + (1+user.getVehicleValue())*0.0937 + (1+user.getAgriHypothecaryValue())*0.2040
                +(1+user.getRenovatedHouse())*0.0409 + (1+user.getDeposit())*0.0330 + (1+user.getFixedAssets())* 0.0084 + (1+user.getMajorExpenditure())*0.0607 + (1+user.getAveIncome())*0.1299
                +(1+user.getLiabilities())*0.0180);
                user.setPaydebtAbilityScore(score);
                score = 550*((1+user.getRaisingNumber())*0.0465 + (1+user.getChildrenEdu())*0.2767 + (1+user.getModernAgriTech())*0.1956 + (1+user.getManpowerRate())*0.0465
                +(1+user.getEducationAttention())*0.0425 +(1+user.getNewsAttention())*0.0073 +(1+user.getPhoneCharge())*0.0028 +(user.getBroadbandBandwidth()+1)*0.0048
                +(1+user.getWeChat())*0.0185 + (1+user.getOnlineFrequency())*0.0119 +(1+user.getFallIll())*0.1135 + (1+user.getAge())*0.0249 + (1+user.getMainStemDistance())*0.0138
                +(1+user.getEducationBackground())*0.0871 + (1+user.getTreatmentCosts())*0.0505 + (1+user.getAddress())*0.0104 + (1+user.getPropertyInsurance())*0.0331 + (1+user.getDamageRate())*0.0083
                +(1+user.getDisasterNumber())*0.0052);
                user.setPaydebtPotentialScore(score);
                break;
            case"businessman":
                System.out.print("businessman called");
                score = 550*((1+user.getHouseValue())*0.1263 + (1+user.getVehicleValue())*0.0438 + (1+user.getAgriculturalEquip())*0.0349 + (1+user.getCommerceHypothecaryValue())*0.1651
                + (1+user.getAgriHypothecaryValue())*0.3321 + (1+user.getRenovatedHouse())*0.0479 + (1+user.getDeposit())*0.1006 + (1+user.getFixedAssets())*0.0095
                +(1+user.getMajorExpenditure())*0.0163 + (1+user.getLiabilities())*0.0944 + (1+user.getMonthRatal())*0.0293);
                user.setPaydebtAbilityScore(score);
                score = 550*((1+user.getPropertyInsurance())*0.1070 +(1+user.getRaisingNumber())*0.0467 + (1+user.getChildrenEdu())*0.2774 + (1+user.getModernAgriTech())*0.1962
                +(1+user.getManpowerRate())*0.0467 + (1+user.getEducationAttention())*0.0296 + (1+user.getNewsAttention())*0.0051 + (1+user.getPhoneCharge())*0.0020
                +(1+user.getBroadbandBandwidth())*0.0034 + (1+user.getWeChat())*0.0129 +(1+user.getOnlineFrequency())*0.0083 + (1+user.getFallIll())*0.1001 + (1+user.getAge())*0.0220
                +(1+user.getMainStemDistance())*0.0121+ (1+user.getEducationBackground())*0.0768 + (1+user.getAddress())*0.0092 + (1+user.getTreatmentCosts())*0.0446);
                user.setPaydebtPotentialScore(score);
                break;
            case"salaryman":
                System.out.print("salaryman called");
                score = 550*((1+user.getAgriculturalEquip())*0.0394 + (1+user.getHouseValue())*0.3698 +(1+user.getVehicleValue())*0.0655 +(1+user.getAgriHypothecaryValue())*0.2119
                +(1+user.getRenovatedHouse()*0.0634)+(1+user.getDeposit())*0.0838+(1+user.getFixedAssets())*0.0135 + (1+user.getMajorExpenditure())*0.0286 +(1+user.getMonthIncome())*0.0797
                +(1+user.getLiabilities())*0.0444);
                user.setPaydebtAbilityScore(score);
                score = 550*((1+user.getRaisingNumber())*0.0534 +(1+user.getChildrenEdu())*0.3177 +(1+user.getModernAgriTech())*0.2246 + (1+user.getManpowerRate())*0.0534
                +(1+user.getEducationAttention())*0.0348 + (1+user.getNewsAttention())*0.0060 + (1+user.getPhoneCharge())*0.0023 +(1+user.getBroadbandBandwidth())*0.0040
                +(1+user.getWeChat())*0.0152 + (1+user.getOnlineFrequency())*0.0097 + (1+user.getFallIll())*0.1055 +(1+user.getAge())*0.0231 + (1+user.getMainStemDistance())*0.0128
                +(1+user.getEducationBackground())*0.0809 + (1+user.getTreatmentCosts())*0.0470 + (1+user.getAddress())*0.0097);
                user.setPaydebtPotentialScore(score);
                break;
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
