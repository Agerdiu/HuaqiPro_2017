<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>普惠立信</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <!-- Bootstrap -->
    <link href="${APP_PATH }/static/css/bootstrap.min.css" rel="stylesheet">
    <link href="${APP_PATH }/static/css/common.css" rel="stylesheet">
    <link href="${APP_PATH }/static/css/luohaowei.css" rel="stylesheet">
</head>
<!-- 导航栏 -->

<body class="body_navbar">
<div id="header">
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" style="padding:0 0 0 15px;" href="indexPage"><img alt="Brand" style="max-width:70px;" src="${APP_PATH }/static/img/logo233.jpg"></a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-left">
                    <li class="active"><a href="indexPage" style="font-size: 20px">首页 <span class="sr-only">(current)</span></a>
                        <p class="line-top hidden-xs"></p>
                    </li>
                    <li><a href="evaluatePage" style="font-size: 20px">征信评估</a></li>
                    <li><a href="evaluate-examplePage" style="font-size: 20px">评估样例</a></li>
                    <li><a href="evaluate-resultPage" style="font-size: 20px">评估报告</a></li>
                    <li><a href="aboutPage" style="font-size: 20px">关于我们</a></li>
                </ul>
                <ul class="nav nav-pills navbar-right">
                    <li role="presentation" class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#" style="margin-top: 5px" role="button" aria-haspopup="true" aria-expanded="false">
                            语言 <span class=" caret "></span>
                        </a>
                        <ul class="dropdown-menu ">
                            <li>
                                <a href="# "><img alt="China" style="max-width: 25px;margin-right: 5px" src="${APP_PATH }/static/img/china.jpg">中文</a>
                            </li>
                            <li>
                                <a href="# "><img alt="China" style="max-width: 25px;margin-right: 5px" src="${APP_PATH }/static/img/English.jpg">English</a>
                            </li>
                        </ul>
                </ul>
                <ul class="nav navbar-nav navbar-right ">
                    <c:choose>
                        <c:when test="${sessionScope.currentUser!=null}">
                            <div class="btn-group">
                                <button type="button" class="btn btn-default dropdown-toggle navbar-btn" data-toggle="dropdown" style="font-size: 20px;" aria-haspopup="true" aria-expanded="false">
                                    <span class="glyphicon glyphicon-user" aria-hidden="true"></span>${sessionScope.currentUserName}
                                    <span class="caret"></span>
                                </button>
                                <ul class="dropdown-menu">
                                    <li><a href="changeInfoPage">修改个人信息</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="loginOut" class="loginOut-btn">退出登录</a></li>
                                </ul>
                            </div>
                        </c:when>
                        <c:otherwise>
                            <li><button type="button" class="btn btn-default navbar-btn login-button" style="font-size: 20px;margin-right: 5px;" id="login_modal_btn"><a href="loginPage">登录</a></button></li>
                            <li><button type="button" class="btn btn-default navbar-btn reg-button" style="font-size: 20px;"id="register_modal_btn"><a href="registerPage">注册</a></button></li>
                        </c:otherwise>
                    </c:choose>
                </ul>
            </div>
        </div>
        <!-- /.container-fluid -->
    </nav>
</div>
<!--导航栏-->
<!--征信表单-->

<div id="zxbd" class="center">
    <h1 align="center" width="50%" style="font-family: Georgia">普惠金融征信评估</h1>
    <form class="form-horizontal" method="post" action="">

        <div class="formword">
            <label>确认身份信息</label>
            <label><input type="checkbox" value="salaryman" name="userType">工薪人员</label>
        </div>
        <div class="formword">
            <label>1.平时家庭主要支出： （从下列选项中选择支出最大的三项）</label>
            <br>
            <label><input type="checkbox" value="0" name="majorExpenditure">A.饮食</label>
            <label><input type="checkbox" value="0" name="majorExpenditure">B.教育</label>
            <label><input type="checkbox" value="0" name="majorExpenditure">C.人际交往</label>
            <label><input type="checkbox" value="0" name="majorExpenditure">D.服装</label>
            <label><input type="checkbox" value="-0.5" name="majorExpenditure">E.房租</label>
            <label><input type="checkbox" value="-0.5" name="majorExpenditure">F.生活缴费</label>
            <label><input type="checkbox" value="0" name="majorExpenditure">G.娱乐休闲</label>
            <label><input type="checkbox" value="-0.5" name="majorExpenditure">H.医疗</label>

        </div>
        <div class="formword">
            <label>2.近五年是否翻修过房屋？</label>
            <label><input type="radio" name="renovatedHouse" value="0">是 </label>
            <label><input type="radio" name="renovatedHouse" value="-1">否 </label>

        </div>
        <div class="formword">
            <label>3.城市住房价值</label>

            <select id="houseValues" name="houseValues">
                <option  name="houseValues" value="" selected>请选择</option>
                <option  name="houseValues" value="-1 ">无城市住房</option>
                <option  name="houseValues" value="-0.6 ">30万以下</option>
                <option  name="houseValues" value="-0.3">30万（含）至60万</option>
                <option  name="houseValues" value="-0.1">60万（含）至100万</option>
                <option  name="houseValues" value="0">100万（含）以上</option>
            </select>
        </div>
        <div class="formword">
            <label>4.农用机械器具总价值（包含拖拉机 单位：元）</label>
            <select id="agriculturalEquip" name="agriculturalEquip">
                <option  name="agriculturalEquip" value="" selected>请选择</option>
                <option name="agriculturalEquip" value="-1">无农用机械</option>
                <option name="agriculturalEquip" value="-0.6">2500以下</option>
                <option name="agriculturalEquip" value="-0.3">2500-5000</option>
                <option name="agriculturalEquip" value="-0.1">5000-10000</option>
                <option name="agriculturalEquip" value="0">10000以上</option>
            </select>

        </div>
        <div class="formword">
            <label>5.车辆价值（允许上高速的） </label>
            <select id="vehicleValue" name="vehicleValue">
                <option  name="vehicleValue" value="" selected>请选择</option>
                <option name="vehicleValue" value="-1">无车辆</option>
                <option name="vehicleValue" value="-0.9">5万以下</option>
                <option name="vehicleValue" value="-0.7">5万（含）至10万</option>
                <option name="vehicleValue" value="-0.45">10万（含）至15万</option>
                <option name="vehicleValue" value="-0.25">15万（含）至20万</option>
                <option name="vehicleValue" value="-0.1">20万（含）至35万</option>
                <option name="vehicleValue" value="0">35万以上</option>
            </select>
        </div>
        <div class="formword">
            <label>6.家庭固定资产（电脑、冰箱、热水器/太阳能、空调）有几件？ </label><br>
            <label><input type="radio" name="fixedAssets" value="-1">A.没有</label>
            <label><input type="radio" name="fixedAssets" value="-0.6">B.1件</label>
            <label><input type="radio" name="fixedAssets" value=" -0.3">C.2件</label>
            <label><input type="radio" name="fixedAssets" value=" -0.1">D.3件</label>
            <label><input type="radio" name="fixedAssets" value="0">E.4件及以上</label>

        </div>
        <div class="formword">
            <label> 7.可抵押的林地、鱼塘、采矿权以及有担保的牲畜价值</label>
            <select id="agriHypothecaryValue" name="agriHypothecaryValue">
                <option name="agriHypothecaryValue" value="-1">5万（含）以下</option>
                <option name="agriHypothecaryValue" value="-0.7">5万至10万（含）</option>
                <option name="agriHypothecaryValue" value="-0.45">10万至20万（含）</option>
                <option name="agriHypothecaryValue" value="-0.25">20万至30万（含）</option>
                <option name="agriHypothecaryValue" value="-0.1">30万至50万（含）</option>
                <option name="agriHypothecaryValue" value="0">50万以上</option>
                <option name="agriHypothecaryValue" value="" selected>请选择</option>
            </select>
        </div>
        <div class="formword">
            <label>8.现有存款额度 </label>
            <select id="deposit" name="deposit">
                <option name="deposit" value="" selected>请选择</option>
                <option name="deposit" value="-1">5万（含）以下</option>
                <option name="deposit" value="-0.7">5万-10万（含）</option>
                <option name="deposit" value="-0.45">10万-20万（含）</option>
                <option name="deposit" value="-0.25">20万-30万（含）</option>
                <option name="deposit" value="-0.1">30万-50万（含）</option>
                <option name="deposit" value="0">50万以上</option>
            </select>
        </div>
        <div class="formword">
            <label>9.月工资收入</label>
            <select id="monthIncome" name="monthIncome">
                <option name="monthIncome" value="" selected>请选择</option>
                <option name="monthIncome" value="-1">2000元（含）以下</option>
                <option name="monthIncome" value="-0.9">2000元~3500元（含）</option>
                <option name="monthIncome" value="-0.7">3500元~5000元（含）</option>
                <option name="monthIncome" value="-0.45">5000元~7000元（含）</option>
                <option name="monthIncome" value="-0.25">7000元~10000元（含）</option>
                <option name="monthIncome" value="-0.1">10000元~15000元（含）</option>
                <option name="monthIncome" value="0">15000元以上</option>
            </select>
        </div>
        <div class="formword">
            <label>10.现有负债额度（银行贷款） </label>
            <select id="liabilities" name="liabilities">
                <option  name="liabilities" value="" selected>请选择</option>
                <option name="liabilities" value="0">5万（含）以下</option>
                <option name="liabilities" value="-0.1">5万-10万（含）</option>
                <option name="liabilities" value="-0.25">10万-20万（含）</option>
                <option name="liabilities" value="-0.45">20万-30万（含）</option>
                <option name="liabilities" value="-0.7">30万-50万（含）</option>
                <option name="liabilities" value="-1">50万以上</option>
            </select>
        </div>
        <div class="formword">
            <label>11.是否在村中担任干部？ </label>
            <label><input name="villageCadres" value="0" type="radio" >是</label>
            <label><input name="villageCadres" value="-1" type="radio" >否</label>
        </div>
        <div class="formword">
            <label>12.当下是否为他人担保 </label>
            <label><input name="guarantee" value="0" accept=""type="radio" >是</label>
            <label><input name="guarantee" value="-1" type="radio" >否</label>
        </div>
        <div class="formword">
            <label>13.当下是否与长辈同住 </label>
            <label><input name="elderLive" value="0" type="radio" >是</label>
            <label><input name="elderLive" value="-1" type="radio" >否</label>
        </div>
        <div class="formword">
            <label>14.曾获什么荣誉信息？ </label>
            <select id="honor" name="honor">
                <option  name="honor" value="" selected>请选择</option>
                <option name="honor" value="-1">无</option>
                <option name="honor" value="0">军烈属</option>
                <option name="honor" value="0">五星文明户（及类似的称号）</option>
                <option name="honor" value="0">人大代表</option>
                <option name="honor" value="0">劳动模范</option>
                <option name="honor" value="0">党员</option>
                <option name="honor" value="0">其他表彰</option>
            </select>
        </div>
        <div class="formword">
            <label> 15.申请贷款担保情况</label>
            <select id="loanGuaratee" name="loanGuaratee">
                <option  name="loanGuaratee" value="" selected>请选择</option>
                <option name="loanGuaratee" value="-1">无担保</option>
                <option name="loanGuaratee" value="0">保证贷款</option>
                <option name="loanGuaratee" value="0">抵押或质押贷款</option>
            </select>
        </div>
        <div class="formword">
            <label>16.贷款申报信息完善程度 </label>
            <select id="informationLevel" name="informationLevel">
                <option  name="informationLevel" value="" selected>请选择</option>
                <option name="informationLevel" value="-1">60%以下</option>
                <option name="informationLevel" value="-0.6">60%-75%</option>
                <option name="informationLevel" value="-0.25">75%-85%</option>
                <option name="informationLevel" value="0">85%-100%</option>
            </select>
        </div>
        <div class="formword">
            <label>17.是否购买人身保险 </label>
            <label><input name="personalInsurance" value="0" type="radio" >是</label>
            <label><input name="personalInsurance" value="-1" type="radio" >否</label>
        </div>
        <div class="formword">
            <label> 18.愿意每年自己花钱去体检吗？</label><br>
            <label><input name="healthExamination" value="0" type="radio" >A.愿意</label>
            <label><input name="healthExamination" value="-0.5" type="radio" >B.不愿意，没时间</label>
            <label><input name="healthExamination" value="-1" type="radio" >C.不愿意，体检收费太高</label>
        </div>
        <div class="formword">
            <label>19.身边人向除了银行以外的地方借款利息是多少</label>
            <select id="interestRate" name="interestRate">
                <option name="interestRate" value="" selected>请选择</option>
                <option name="interestRate" value="0">不知道</option>
                <option name="interestRate" value="0">0~2%</option>
                <option name="interestRate" value="-1">2%~3%</option>
                <option name="interestRate" value="0">3%~5%</option>
                <option name="interestRate" value="0">5%及以上</option>
            </select>
        </div>
        <div class="formword">
            <label>20.现居住地居住时间 </label>
            <label><input name="residenceTime" value="0" type="radio" >A.五年以上</label>
            <label><input name="residenceTime" value="-1" type="radio" >B.五年以下（包含五年）</label>
        </div>
        <div class="formword">
            <label> 21.婚姻状况</label>
            <select id="maritalStatus" name="maritalStatus" onchange="getSltValue()">

                <option name="maritalStatus" value="003">已婚</option>
                <option name="maritalStatus" value="002">离婚</option>
                <option name="maritalStatus" value="000">未婚/丧偶</option>
                <option name="maritalStatus" value="999" selected>请选择</option>

            </select>

            <!-- 根据21题的结果判断下两题是否需要填写-->
            <script type="text/javascript">
                function getSltValue() {
                    if (document.getElementById("maritalStatus").value == 000) {

                        document.getElementById("married").style.visibility = "hidden";
                        document.getElementById("divorced").style.visibility = "hidden";


                    }
                    if (document.getElementById("maritalStatus").value == 002) {
                        document.getElementById("married").style.visibility = "hidden";
                        document.getElementById("divorced").style.visibility = "visible";

                    }
                    if (document.getElementById("maritalStatus").value == 003) {

                        document.getElementById("divorced").style.visibility = "hidden";

                        document.getElementById("married").style.visibility = "visible";
                    }
                    if (document.getElementById("maritalStatus").value == 999) {

                        document.getElementById("married").style.visibility = "visible";
                        document.getElementById("divorced").style.visibility = "visible";


                    }
                }
            </script>
        </div>
        <div class="formword">
            <label>22.已婚</label>
            <label>现任配偶是第几任配偶</label>
            <select id="married" name="married">
                <option name="married" value=" " selected>请选择</option>
                <option name="married" value="0">第一任</option>
                <option name="married" value="-0.1">第二任</option>
                <option name="married" value="-0.5">第三仍以及以上</option>
            </select>
        </div>

        <div class="formword">
            <label>23.离婚</label>
            <label>上一次婚姻持续多久</label>
            <select id="divorced" name="divorced">
                <option name="divorced" value=" " selected>请选择</option>
                <option name="divorced" value="-1">1年以及以下</option>
                <option name="divorced" value="-0.5">1年-3年（含）</option>
                <option name="divorced" value="-0.2">3年-7年（含）</option>
                <option name="divorced" value="-0.1">7年以上</option>

            </select>
        </div>
        <div class="formword">
            <label> 24.手机号更换频率</label>
            <select id="phoneNumReplace" name="phoneNumReplace">
                <option  name="phoneNumReplace" value="" selected>请选择</option>
                <option name="phoneNumReplace" value="-1">平均半年换一次</option>
                <option name="phoneNumReplace" value="-0.6">平均一年换一次</option>
                <option name="phoneNumReplace" value="-0.3">平均两年换一次</option>
                <option name="phoneNumReplace" value="-0.1">平均三年换一次</option>
                <option name="phoneNumReplace" value="0">三年以上换一次</option>
            </select>
        </div>
        <div class="formword">
            <label> 25.年龄</label>
            <select id="age" name="age">
                <option  name="age" value="" selected>请选择</option>
                <option name="age" value="-0.3">18岁-30岁</option>
                <option name="age" value="0">31岁-50岁</option>
                <option name="age" value="-0.2">51岁-60岁</option>
                <option name="age" value="-0.5">61岁以上</option>
            </select>
        </div>
        <div class="formword">
            <label> 26.近几年有生过很大的病吗？</label>
            <label><input name="fallIll" type="radio" value="-1">有</label>
            <label><input name="fallIll" type="radio" value="0">无</label>

        </div>
        <div class="formword">
            <label> 27.家庭常住地址所在地</label>
            <label><input name="address" type="radio" value="0">城镇</label>
            <label><input name="address" type="radio" value="-0.5">农村</label>

        </div>
        <div class="formword">
            <label> 28.学历</label>
            <select id="educationBaclground" name="educationBaclground">
                <option  name="educationBaclground" value="" selected>请选择</option>
                <option name="educationBaclground" value="-1">初中及初中以下</option>
                <option name="educationBackground" value="-0.6">高中或中专</option>
                <option name="educationBackground" value="-0.3">大专</option>
                <option name="educationBackground" value="0">本科及本科以上</option>

            </select>
        </div>
        <div class="formword">
            <label> 29.你们村离主干道（国道、省道）有多远？</label>
            <select id="mainStemDistance" name="mainStemDistance">
                <option  name="mainStemDistance" value="" selected>请选择</option>
                <option name="mainStemDistance" value="0">距离主干道2000米以内</option>
                <option name="mainStemDistance" value="-0.2">距离主干道2000米（含）-5000米</option>
                <option name="mainStemDistance" value="-0.5">距离主干道5000米（含）-10000米</option>
                <option name="mainStemDistance" value="-1">距离主干道10000米以上</option>
            </select>
        </div>
        <div class="formword">
            <label>30.近3年内，家里人去市级或省级以上医院看病大概花了多少钱？ </label>
            <select id="treatmentCosts" name="treatmentCosts">
                <option  name="treatmentCosts" value="" selected>请选择</option>
                <option name="treatmentCosts" value="-0.1">1万元以下</option>
                <option name="treatmentCosts" value="-0.25">1万-5万（含）</option>
                <option name="treatmentCosts" value="-0.45">5万-10万（含）</option>
                <option name="treatmentCosts" value="-0.7">10万-15万（含）</option>
                <option name="treatmentCosts" value="-1">15万以上</option>
                <option name="treatmentCosts" value="0">没去过市级或省级以上的医院</option>
                <option name="treatmentCosts" value="0">近三年内家人没生过大病</option>
            </select>
        </div>
        <div class="formword">
            <label> 31.需要抚养及赡养的人口数</label>
            <select id="raisingNumber" name="raisingNumber">
                <option  name="raisingNumber" value="" selected>请选择</option>
                <option name="raisingNumber" value="0">3个以及以下</option>
                <option name="raisingNumber" value="-0.2">4个到5个</option>
                <option name="raisingNumber" value="-0.5">6个以及以上</option>

            </select>
        </div>
        <div class="formword">
            <label>32.子女教育情况 </label>
            <select id="childrenEdu" name="childrenEdu">
                <option  name="childrenEdu" value="" selected>请选择</option>
                <option name="childrenEdu" value="0">本科以及本科以上</option>
                <option name="childrenEdu" value="-0.5">高中或中专</option>
                <option name="childrenEdu" value="-1">初中及初中以下</option>
                <option name="childrenEdu" value="0">尚无子女</option>

            </select>
        </div>
        <div class="formword">
            <label> 33.劳动力占家庭人数比</label>
            <select id="manpowerRate" name="manpowerRate">
                <option  name="manpowerRate" value="" selected>请选择</option>
                <option name="manpowerRate" value="-1">25%以下</option>
                <option name="manpowerRate" value="-0.5">25%（含）-50%</option>
                <option name="manpowerRate" value="-0.2">50%（含）-75%</option>
                <option name="manpowerRate" value="0">75%（含）-100%</option>

            </select>
        </div>
        <div class="formword">
            <label> 34.是否参加财产保险</label>
            <label><input name="propertyInsurance" value="0" type="radio" >参加</label>
            <label><input name="propertyInsurance" value="-1" type="radio" >没参加</label>
        </div>

        <div class="formword">
            <label>35.贷款用途 </label>
            <select id="loanUse" name="loanUse">
                <option  name="loanUse" value="" selected>请选择</option>
                <option name="loanUse" value="消费贷款">消费贷款（求学、买房、买车、耐用品）</option>
                <option name="loanUse" value="农业生产投入">农业生产投入贷款</option>
                <option name="loanUse" value="建设贷款">个体、私营企业建设贷款</option>

            </select>
        </div>
        <div class="formword">
            <label>36.是否关注时事新闻 </label>
            <label><input name="newsAttention" value="0" type="radio" >是</label>
            <label><input name="newsAttention" value="-1" type="radio" >否</label>
        </div>
        <div class="formword">
            <label> 37.是否重视后代教育</label>
            <label><input name="educationAttention" value="0" type="radio" >是</label>
            <label><input name="educationAttention" value="-1" type="radio" >否</label>
        </div>
        <div class="formword">
            <label> 38.网络利用频率</label>
            <label><input name="onlineFrequency" value="0" type="radio" >高</label>
            <label><input name="onlineFrequency" value="-1" type="radio" >低</label>
        </div>
        <div class="formword">
            <label>39.你家的宽带带宽是多少？ </label>
            <select id="broadbandBandwidth" name="broadbandBandwidth">
                <option  name="broadbandBandwidth" value="" selected>请选择</option>
                <option name="broadbandBandwidth" value="-1">没有宽带</option>
                <option name="broadbandBandwidth" value="-0.5">0~20兆(含）</option>
                <option name="broadbandBandwidth" value="-0.2">20兆~50兆（含）</option>
                <option name="broadbandBandwidth" value="0">50兆~100兆（含）</option>
            </select>
        </div>
        <div class="formword">
            <label>40.每个月的话费需要多少？ </label>
            <select id="phoneCharge" name="phoneCharge">
                <option  name="phoneCharge" value="" selected>请选择</option>
                <option name="phoneCharge" value="-1">30元以下</option>
                <option name="phoneCharge" value="-0.5">30元（含）~60元</option>
                <option name="phoneCharge" value="-0.2">60元（含）~100元</option>
                <option name="phoneCharge" value="0">100元（含）以上</option>
            </select>
        </div>

        <div class="formword">
            <label>41.微信的主要用途 </label>
            <select id="weChat" name="weChat">
                <option  name="weChat" value="" selected>请选择</option>
                <option neme="weChat" value="-1">没有微信</option>
                <option neme="weChat" value="-0.5">私人社交（聊天、朋友圈）</option>
                <option neme="weChat" value="-0.2">支付（日常支付）</option>
                <option neme="weChat" value="0">工作（谈生意、收发文件、转账结算）</option>
            </select>
        </div>
        <div class="formword">
            <label> 42.是否欠缴费用</label>
            <label><input name="arrearage" value="-1" type="radio" >是</label>
            <label><input name="arrearage" value="0" type="radio" >否</label>
        </div>
        <div class="formword">
            <label> 43.家庭成员有无不良行为（酗酒、暴力、吸毒等）</label>
            <label><input name="badActions" value="-1" type="radio" >是</label>
            <label><input name="badActions" value="0" type="radio" >否</label>
        </div>
        <div class="formword">
            <label> 44.是否有延迟还款行为</label>
            <label><input name="layPayment" value="-1" type="radio" >是</label>
            <label><input name="layPayment" value="0" type="radio" >否</label>
        </div>
        <div class="formword">
            <label> 45.是否有过民间借贷行为</label>
            <label><input name="privateLending" value="-1" type="radio" >是</label>
            <label><input name="privateLending" value="0" type="radio" >否</label>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button class="btn btn-default" type="reset">重置</button>
                <!--button type="submit" class="btn btn-default" onclick="submitted()">提交</button-->
                <a type="button" class="btn btn-default " href="evaluate-resultPage" onclick="submitted()">提交</a>
            </div>
        </div>
    </form>
</div>
<!--征信表单-->

<!-- 尾部导航栏 -->
<div id="sidebar-bg" style="display: none;"></div>
<!-- 立即咨询 -->
<div class="contact-banner">
    <canvas id="waves" class="waves"></canvas>
    <div class="container">
        <div class="row">
            <div class="col-sm-12 contact-banner-box">
                <h2 class="h1">惠普立信</h2>
                <h4>浓墨重彩推普惠，贷动三农新篇章</h4>
            </div>
        </div>
    </div>
</div>
<!-- 立即咨询 -->
<!-- 通用页脚 -->
<div id="footer">
    <div class="container">
        <div class="row">
            <div class="col-xs-6 col-sm-2 footer-item">
                <div class="footer-list">
                    <a href="indexPage">
                        <h4>首页</h4>
                    </a>
                </div>
            </div>
            <div class="col-xs-6 col-sm-2 footer-item">
                <div class="footer-list">
                    <a href="evaluatePage">
                        <h4>征信评估</h4>
                    </a>
                </div>
            </div>
            <div class="col-xs-6 col-sm-2 footer-item">
                <div class="footer-list">
                    <a href="evaluate-examplePage">
                        <h4>评估样例</h4>
                    </a>
                </div>
            </div>
            <div class="col-xs-6 col-sm-2  footer-item ">
                <div class="footer-list">
                    <a href="evaluate-resultPage">
                        <h4>评估报告</h4>
                    </a>
                </div>
            </div>
            <div class="col-xs-6 col-sm-2 footer-item  ">
                <div class="footer-list">
                    <a href="aboutPage">
                        <h4>关于我们</h4>
                    </a>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<div id="copyright">
    <div class="container">
        <div class="row">
            <div class="col-sm-12">
                <p>Copyright © 2017 huinong.com All Rights Reversed. 惠农科技
                    <a target="_blank" href="#"></a>
                </p>
            </div>
        </div>
    </div>
</div>

<!-- 通用页脚 -->

<!-- 尾部导航栏 -->



<!-- 第一题多选题只能选择三个选项-->
<script>
    var count = 0;
    onload = function() {
        var cks = document.querySelectorAll("div.formword input[type=checkbox]");
        for (var i = 1; i < cks.length; i++) {
            var cki = cks[i];
            cki.onchange = function() {
                if (this.checked) {
                    count++;
                } else {
                    count--;
                }
                if (count > 3) {
                    alert("选择不能超过3个");
                    this.checked = false;
                    count--;
                }
            }
        }
    }
</script>

<!-- 第一题多选题只能选择三个选项-->
<script>
    var count = 0;
    onload = function() {
        var cks = document.querySelectorAll("div.formword input[type=checkbox]");
        for (var i = 0; i < cks.length; i++) {
            var cki = cks[i];
            cki.onchange = function() {
                if (this.checked) {
                    count++;
                } else {
                    count--;
                }
                if (count > 3) {
                    alert("选择不能超过3个");
                    this.checked = false;
                    count--;
                }
            }
        }
    }
</script>


<!-- 通用页脚 -->

<script src="${APP_PATH }/static/js/jquery-3.2.1.min.js" ></script>
<script src="${APP_PATH }/static/js/bootstrap.min.js" ></script>
<script src="${APP_PATH }/static/js/common.js" ></script>
<script src="${APP_PATH }/static/js/login.js" ></script>
<script src="${APP_PATH }/static/js/register.js" ></script>
<script src="${APP_PATH }/static/js/evaluate_common.js" ></script>
</body>
</html>


