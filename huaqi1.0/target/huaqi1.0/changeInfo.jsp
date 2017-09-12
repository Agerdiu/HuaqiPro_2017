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
                    <c:choose>
                        <c:when test="${sessionScope.currentUser!=null}">
                            <div class="btn-group">
                                <button type="button" class="btn btn-default dropdown-toggle navbar-btn" data-toggle="dropdown" style="font-size: 20px;" aria-haspopup="true" aria-expanded="false">
                                    <span class="glyphicon glyphicon-user" aria-hidden="true"></span>${sessionScope.currentUserName}
                                    <span class="caret"></span>
                                </button>
                                <ul class="dropdown-menu">
                                    <li><a href="#">查看我的信息</a></li>
                                    <li><a href="#">修改个人信息</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="loginOut" class="loginOut-btn">退出登录</a></li>
                                </ul>
                            </div>
                        </c:when>
                        <c:otherwise>
                            <li><button type="button" class="btn btn-default navbar-btn login-button" style="font-size: 20px;margin-right: 5px;" id="login_modal_btn">登录</button></li>
                            <li><button type="button" class="btn btn-default navbar-btn reg-button" style="font-size: 20px;"id="register_modal_btn">注册</button></li>
                        </c:otherwise>
                    </c:choose>
                </ul>
            </div>
        </div>
        <!-- /.container-fluid -->
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

<!--信息修改-->
<div style="width:80%;" class="panel panel-primary center-block" id="yangli">
    <!-- Default panel contents -->
    <div class="panel-heading">信息修改</div>
    <div class="panel-body">
        <p>基本信息</p>
    </div>
<form id="change-form">
    <table class="table table-bordered " >

        <tr>
            <th>姓名</th>
            <th>婚姻状态</th>
            <th>证件类型</th>
            <th>证件号</th>
        </tr>
        <tr>
            <td><input type="text" name="userName" class="form-control" id="change_userName_input" placeholder="Name"></td>
            <td id="maritalStatus"></td>
            <td>身份证</td>
            <td>${sessionScope.currentUser}</td>
        </tr>
        <tr>
            <th>性别</th>
            <th>密码</th>
            <th>邮箱</th>
            <th>手机号</th>
        </tr>
        <tr>
            <td id="gender">
                <label class="radio-inline">
                    <input type="radio" name="gender" id="change_gender_input1" value="M" checked="checked"> 男
                </label>
                <label class="radio-inline">
                    <input type="radio" name="gender" id="change_gender_input2" value="F"> 女
                </label>
            </td>
            <td><input type="text" name="userName" class="form-control" id="change_password_input" placeholder="Name"></td>
            <td><input type="text" name="userName" class="form-control" id="change_email_input" placeholder="Name"></td>
            <td><input type="text" name="userName" class="form-control" id="change_tel_input" placeholder="Name"></td>
        </tr>
        <tr>
            <td colspan="4">
            <button type="button" class="btn btn-success" style="display:inline;float:right" id="save-btn">保存</button>
            <button type="button" class="btn btn-default" style="display:inline;float:right">取消</button>
            </td>
        </tr>
    </table>
</form>
</div>
<script type="text/javascript">
    var userName=null;
    var maritalStatus=null;
    var password=null;
    var email=null;
    var tel=null;
    var gender=null;
    $(function getUserInfo() {
        $.ajax({
            url:"${APP_PATH}/getUserInfo",
            data:null,
            type:"GET",
            success:function(result) {
                userName = result.extend.userInfo.userName;
                maritalStatus = result.extend.userInfo.maritalStatus;
                password = result.extend.userInfo.password;
                email = result.extend.userInfo.email;
                tel = result.extend.userInfo.tel;
                gender = result.extend.userInfo.gender;
                $("#change_userName_input").val(userName);
                $("#maritalStatus").html(maritalStatus);
                $("#change_password_input").val(password);
                $("#change_email_input").val(email);
                $("#change_tel_input").val(tel);
                $("input[name=gender]").val([gender]);
            }
            });
    });
</script>

<!--信息修改-->

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
                    <a href="#">
                        <h4>首页</h4>
                    </a>
                </div>
            </div>
            <div class="col-xs-6 col-sm-2 footer-item">
                <div class="footer-list">
                    <a href="#">
                        <h4>征信评估</h4>
                    </a>
                </div>
            </div>
            <div class="col-xs-6 col-sm-2 footer-item">
                <div class="footer-list">
                    <a href="#">
                        <h4>评估样例</h4>
                    </a>
                </div>
            </div>
            <div class="col-xs-6 col-sm-2  footer-item ">
                <div class="footer-list">
                    <a href="#">
                        <h4>账户管理</h4>
                    </a>
                </div>
            </div>
            <div class="col-xs-6 col-sm-2 footer-item  ">
                <div class="footer-list">
                    <a href="#">
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


<script src="${APP_PATH }/static/js/bootstrap.min.js" ></script>
<script src="${APP_PATH }/static/js/common.js" ></script>
<script src="${APP_PATH }/static/js/login.js" ></script>
<script src="${APP_PATH }/static/js/register.js" ></script>
<script src="${APP_PATH }/static/js/changeInfo.js" ></script>
</body>
</html>


