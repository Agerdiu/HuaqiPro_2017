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
    <script src="${APP_PATH }/static/js/jquery-3.2.1.min.js" ></script>
    <script src="${APP_PATH }/static/js/highcharts.js" ></script>
    <script src="${APP_PATH }/static/js/countUp.js" ></script>
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
                <a class="navbar-brand" style="padding:0 0 0 15px;" href="#"><img alt="Brand" style="max-width:70px;" src="${APP_PATH }/static/img/logo233.jpg"></a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-left">
                    <li class="active"><a href="#" style="font-size: 20px">首页 <span class="sr-only">(current)</span></a>
                        <p class="line-top hidden-xs"></p>
                    </li>
                    <li><a href="#" style="font-size: 20px">征信评估</a></li>
                    <li><a href="#" style="font-size: 20px">评估样例</a></li>
                    <li><a href="#" style="font-size: 20px">账户管理</a></li>
                    <li><a href="#" style="font-size: 20px">关于我们</a></li>
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
                    <li><button type="button" class="btn btn-primary" style="font-size: 20px;" id="login_modal_btn">登录</button></li>
                    <li><a href="" style="font-size: 20px; margin:0 -30px 0 -30px; ">|</a></li>
                    <li><button type="button" class="btn btn-primary" id="register_modal_btn">注册</button></li>

                </ul>
            </div>
        </div>
    </nav>
</div>
<!--导航栏-->

<!--登录模态框-->
<div class="modal fade" id="login_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" >登录</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">身份证号</label>
                        <div class="col-sm-10">
                            <input type="text" name="id" class="form-control" id="login_id_input" placeholder="Id">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">密码</label>
                        <div class="col-sm-10">
                            <input type="password" name="password" class="form-control" id="login_password_input" placeholder="Password">
                            <span class="help-block"></span>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" id="login_btn">登录</button>
                <button type="button" class="btn btn-primary" id="login_register_btn">注册</button>
            </div>
        </div>
    </div>
</div>
<!--登录模态框-->

<!--注册模态框-->
<div class="modal fade" id="register_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" >注册</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">身份证号</label>
                        <div class="col-sm-10">
                            <input type="text" name="id" class="form-control" id="reg_id_input" placeholder="Id">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">姓名</label>
                        <div class="col-sm-10">
                            <input type="text" name="userName" class="form-control" id="reg_userName_input" placeholder="Name">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">性别</label>
                        <label class="radio-inline">
                            <input type="radio" name="gender" id="gender_input1" value="M" checked="checked"> 男
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="gender" id="gender_input2" value="F"> 女
                        </label>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">密码</label>
                        <div class="col-sm-10">
                            <input type="password" name="password" class="form-control" id="reg_password_input" placeholder="Password">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">邮箱</label>
                        <div class="col-sm-10">
                            <input type="email" name="email" class="form-control" id="reg_email_input" placeholder="Email">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">手机号</label>
                        <div class="col-sm-10">
                            <input type="text" name="tel" class="form-control" id="reg_tel_input" placeholder="Tel">
                            <span class="help-block"></span>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default"  id="register_btn">立即注册</button>
                <button type="button" class="btn btn-primary" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>
<!--注册模态框-->

<!--评估信息-->
<div style="width:80%;" class="panel panel-primary center-block" id="yangli">
    <!-- Default panel contents -->
    <div class="panel-heading">评估样例</div>
    <div class="panel-body">
        <p>基本信息</p>
    </div>

    <table class="table table-bordered ">

        <tr>
            <th>姓名</th>
            <th>婚姻状态</th>
            <th>证件类型</th>
            <th>证件号</th>
        </tr>
        <tr>
            <td id="userName"></td>
            <td id="maritalStatus"></td>
            <td >身份证</td>
            <td id="id"></td>
        </tr>
        <tr>
            <th style="height:400px" id="pingji">评级结果</th>
            <td colspan="3"  style="height:400px;max-width:200px" id="container" ></td>
        </tr>
        <tr>
            <th colspan="4" class="bg-success">债偿能力</th>
        </tr>
        <tr>
            <td colspan="4">
                <div class="progress">
                    <div class="progress-bar progress-bar-warning  progress-bar-striped active" id="progress1" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 76%;">
                        76%
                    </div>
                </div>
                <div>
                    <h4>偿债潜力评级为：
                        <strong id="rank1"></strong>
                    </h4>
                    <h4>偿债潜力部分得分为：
                        <strong id="num1"></strong>
                    </h4>
                    <h4 id="comment1"></h4>
                </div>
            </td>
        </tr>
        <tr>
            <th colspan="4" class="bg-info">信用体系</th>
        </tr>
        <tr>
            <td colspan="4">
                <div class="progress">
                    <div class="progress-bar progress-bar-success  progress-bar-striped active" id="progress2" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 86%;">
                        86%
                    </div>
                </div>
                <div>
                    <h4>偿债潜力评级为：
                        <strong id="rank2"></strong>
                    </h4>
                    <h4>偿债潜力部分得分为：
                        <strong id="num2"></strong>
                    </h4>
                    <h4 id="comment2"></h4>
                </div>
            </td>
        </tr>
        <tr>
            <th colspan="4" class="bg-warning">债偿潜力</th>
        </tr>
        <tr>
            <td colspan="4">
                <div class="progress">
                    <div class="progress-bar progress-bar-success progress-bar-striped active" id="progress3" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 91%;">
                        91%
                    </div>
                </div>
                <div>
                    <h4>偿债潜力评级为：
                        <strong id="rank3"></strong>
                    </h4>
                    <h4>偿债潜力部分得分为：
                        <strong id="num3"></strong>
                    </h4>
                    <h4 id="comment3"></h4>
                </div>
            </td>
        </tr>
    </table>
</div>
<script type="text/javascript">
    var userName=null;
    var maritalStatus=null;
    var id=null;
    var paydebtAbilityScore=null;
    var paydebtAbilityLevel=null;
    var paydebtPotentialScore=null;
    var paydebtPotentialLevel=null;
    var paydebtSystemScore=null;
    var paydebtSystemLevel=null;
//页面加载完成后，发送ajax请求，得到评估结果信息
$(function getinfo(){
    $.ajax({
        url:"${APP_PATH}/evaluateResult",
        data:null,
        type:"GET",
        success:function(result){
            userName=result.userName;
            maritalStatus=result.maritalStatus;
            id=result.id;
            paydebtAbilityScore=result.paydebtAbilityScore;
            paydebtAbilityLevel=result.paydebtAbilityLevel;
            paydebtPotentialScore=result.paydebtPotentialScore;
            paydebtPotentialLevel=result.paydebtPotentialLevel;
            paydebtSystemScore=result.paydebtSystemScore;
            paydebtSystemLevel=result.paydebtSystemLevel;
        }
    });
    changeinfo();
});

/**得分数字显示js*/
var num1 = new CountUp("num1", 0, paydebtAbilityScore);
if (!num1.error) {
    num1.start();
} else {
    console.error(num1.error);
}
var num2 = new CountUp("num2", 0, paydebtSystemScore);
if (!num2.error) {
    num2.start();
} else {
    console.error(num2.error);
}
var num3 = new CountUp("num3", 0, paydebtPotentialScore);
if (!num3.error) {
    num3.start();
} else {
    console.error(num3.error);
}
/**得分数字显示js*/

/**图表部分显示的js**/
var chart = new Highcharts.Chart('container', {
    chart: {
        type: 'bar' //指定图表的类型，默认是折线图（line）
    },
    title: {
        text: '评级结果图' //指定图表标题
    },
    xAxis: {
        categories: ['偿债能力得分', '信用评级得分', '偿债潜力得分'] //指定x轴分组
    },
    yAxis: {
        title: {
            text: '得分' //指定y轴的标题
        }
    },
    series: [{ //指定数据列
        name: '得分情况', //数据列名
        data: [paydebtAbilityScore, paydebtSystemScore, paydebtPotentialScore] //数据
    }]
});
/**图表部分显示的js**/

function changeinfo(){
    $("#userName").empty();
    $("#userName").append(userName);
    $("#maritalStatus").empty();
    $("#maritalStatus").append(maritalStatus);
    $("#id").empty();
    $("#id").append(id);
    $("#rank1").empty();
    $("#rank1").append(paydebtAbilityLevel);
    $("#rank2").empty();
    $("#rank2").append(paydebtSystemLevel);
    $("#rank3").empty();
    $("#rank3").append(paydebtPotentialLevel);
    $("#progress1").empty();
    $("#progress1").width(paydebtAbilityScore/550+"%");
    $("#progress2").empty();
    $("#progress2").width(paydebtSystemScore/550+"%");
    $("#progress3").empty();
    $("#progress3").width(paydebtPotentialScore/550+"%");
    $("#comment1").empty();
    $("#comment2").empty();
    $("#comment3").empty();
    switch(paydebtSystemLevel)
    {
        case "D":
            $("#comment1").append("不符合最低分数线，偿债能力较差，偿还可能性较低，不建议批准贷款");
        case "C":
            $("#comment1").append("略高于最低偿债分数线，存在偿还可能性，但是可能性偏低，可试着考虑综合其他部分得分，再批准贷款");
        case "CC":
            $("#comment1").append("略高于最低偿债分数线，存在偿还可能性，但是可能性偏低，可试着考虑综合其他部分得分，再批准贷款");
        case "CCC":
            $("#comment1").append("略高于最低偿债分数线，存在偿还可能性，但是可能性偏低，可试着考虑综合其他部分得分，再批准贷款");
        case "B":
            $("#comment1").append("偿债能力达到中等水平，偿还可能性较强，可综合考虑其他部分评分，再批准贷款");
        case "BB":
            $("#comment1").append("偿债能力达到中等水平，偿还可能性较强，可综合考虑其他部分评分，再批准贷款");
        case "BBB":
            $("#comment1").append("偿债能力达到中等水平，偿还可能性较强，可综合考虑其他部分评分，再批准贷款");
        case "A":
            $("#comment1").append("偿债能力达到优良偏上水平，偿还可能性较强，可综合考虑其他部分评分，再批准贷款");
        case "AA":
            $("#comment1").append("偿债能力达到优良偏上水平，偿还可能性较强，可综合考虑其他部分评分，再批准贷款");
        case "AAA":
            $("#comment1").append("偿债能力达到优秀水平水平，偿还可能性较强，可综合考虑其他部分评分，再批准贷款");
    }
    switch(paydebtAbilityLevel)
    {
        case "D":
            $("#comment2").append("不符合最低分数线，信用较差，偿还可能性较低，不建议批准贷款");
        case "C":
            $("#comment2").append("略高于最低信用分数线，存在偿还可能性，但是可能性偏低，可试着考虑综合其他部分得分，再批准贷款");
        case "CC":
            $("#comment2").append("略高于最低信用分数线，存在偿还可能性，但是可能性偏低，可试着考虑综合其他部分得分，再批准贷款");
        case "CCC":
            $("#comment2").append("略高于最低信用分数线，存在偿还可能性，但是可能性偏低，可试着考虑综合其他部分得分，再批准贷款");
        case "B":
            $("#comment2").append("信用达到中等水平，偿还可能性较强，可综合考虑其他部分评分，再批准贷款");
        case "BB":
            $("#comment2").append("信用达到中等水平，偿还可能性较强，可综合考虑其他部分评分，再批准贷款");
        case "BBB":
            $("#comment2").append("信用达到优良偏上水平，偿还可能性较强，可综合考虑其他部分评分，再批准贷款");
        case "A":
            $("#comment2").append("信用达到优良偏上水平，偿还可能性较强，可综合考虑其他部分评分，再批准贷款");
        case "AA":
            $("#comment2").append("信用达到优良偏上水平，偿还可能性较强，可综合考虑其他部分评分，再批准贷款");
        case "AAA":
            $("#comment2").append("信用能力达到优秀水平水平，偿还可能性较强，可综合考虑其他部分评分，再批准贷款");
    }
    switch(paydebtAbilityLevel)
    {
        case "D":
            $("#comment3").append("偿债潜力较差");
        case "C":
            $("#comment3").append("略高于最低偿债潜力线，偿债潜力较差");
        case "CC":
            $("#comment3").append("略高于最低偿债潜力线，偿债潜力较差");
        case "CCC":
            $("#comment3").append("略高于最低偿债潜力线，偿债潜力较差");
        case "B":
            $("#comment3").append("偿债潜力达到中等水平");
        case "BB":
            $("#comment3").append("偿债潜力达到中等水平");
        case "BBB":
            $("#comment3").append("偿债潜力达到中等水平");
        case "A":
            $("#comment3").append("偿债潜力达到优良偏上水平");
        case "AA":
            $("#comment3").append("偿债潜力达到优良偏上水平");
        case "AAA":
            $("#comment3").append("偿债潜力达到优秀水平");
    }
}
    /*******图表自适应窗口改变*****************/
    $(window).resize(function () {
        var width = $("#yangli").width() - $("#pingji").width() - 34;
        console.log($("#yangli").width(), $("#pingji").width());
        chart.setSize(width, 400);
    });
</script>
<!--评估信息-->

<!-- 尾部导航栏 -->
<div id="sidebar-bg" style="display: none;"></div>
<!-- 立即咨询 -->
<div class="contact-banner">
    <canvas id="waves" class="waves"></canvas>
    <div class="container">
        <div class="row">
            <div class="col-sm-12 contact-banner-box">
                <h2 class="h1">更多疑问 全面解答</h2>
                <h4>资深美签专家在线为您解答所有疑惑</h4>
                <a href="javascript:;" class="btn btn-outline-inverse btn-lg web-chat">免费咨询</a>
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
                    <h4>首页</h4>
                </div>
            </div>
            <div class="col-xs-6 col-sm-2 footer-item">
                <div class="footer-list">
                    <h4>征信评估</h4>
                </div>
            </div>
            <div class="col-xs-6 col-sm-2 footer-item">
                <div class="footer-list">
                    <h4>评估样例</h4>
                </div>
            </div>
            <div class="col-xs-6 col-sm-2  footer-item ">
                <div class="footer-list">
                    <h4>账户管理</h4>
                </div>
            </div>
            <div class="col-xs-6 col-sm-2 footer-item  ">
                <div class="footer-list">
                    <h4>关于我们</h4>
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
                <p>Copyright © 2017 huinong.com All Rights Reversed. 惠农科技 <a target="_blank" href="#">京ICP备16015317号</a></p>
            </div>
        </div>
    </div>
</div>
<!-- 通用页脚 -->


<script src="${APP_PATH }/static/js/bootstrap.min.js" ></script>
<script src="${APP_PATH }/static/js/common.js" ></script>
<script src="${APP_PATH }/static/js/login.js" ></script>
<script src="${APP_PATH }/static/js/register.js" ></script>
<script src="${APP_PATH }/static/js/evaluate.js" ></script>
</body>
</html>

