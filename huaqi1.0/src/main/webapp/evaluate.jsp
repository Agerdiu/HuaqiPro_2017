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

<!--分类选项-->

<div class="mikuMiku" style="background: url(${APP_PATH }/static/img/57321231_p0.jpg) no-repeat center;">
<div class="nagato">
        <div class="three-select-css">
            <a href="evaluate-farmerPage">
                <div>
                    <h1 class="yamato">农业劳动人员</h1>
                    <p class="musashi">畜牧业、林业、渔业、种植业</p>
                </div>
            </a>
        </div>
        <div class="three-select-css">
            <a href="evaluate-businessmanPage">
                <div>
                    <h1 class="yamato">个体工商户</h1>
                </div>
            </a>
        </div>
        <div class="three-select-css">
            <a href="evaluate-salarymanPage">
                <div>
                    <h1 class="yamato">工薪人员</h1>
                </div>
            </a>
        </div>
    </div>
</div>
<!--分类选项-->

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

<script src="${APP_PATH }/static/js/jquery-3.2.1.min.js" ></script>
<script src="${APP_PATH }/static/js/bootstrap.min.js" ></script>
<script src="${APP_PATH }/static/js/common.js" ></script>
<script src="${APP_PATH }/static/js/login.js" ></script>
<script src="${APP_PATH }/static/js/register.js" ></script>
</body>
</html>


