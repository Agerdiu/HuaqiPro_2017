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


<!-- 滚动图片广告-->
<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
        <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <img src="${APP_PATH }/static/img/num_1.jpg" alt="picture1">

        </div>
        <div class="item">
            <img src="${APP_PATH }/static/img/num_2.jpg" alt="picture2">
        </div>
    </div>

    <!-- Controls -->
    <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
<!--滚动图片广告 -->

<!-- STEP步骤 -->
<div class="index-row our-data ">
    <div class="container ">
        <div class="row ">
            <div class="col-sm-12 main-title ">
                <h1>STEP</h1>
                <h1>步骤</h1>
                <p class="line line-big "></p>
            </div>
            <div class="col-sm-3 ">
                <div class="our-whyus-item ">
                    <span class="glyphicon glyphicon-th-list " aria-hidden="true "></span>

                    <h4 class="title ">只需三步</h4>
                    <h4 class="title ">给你安全可靠的征信报告</h4>
                </div>
            </div>
            <div class="col-sm-3 ">
                <div class="our-whyus-item ">
                    <span style="font-size: 80px; " class="glyphicon glyphicon-user " aria-hidden="true "></span>

                    <h4 class="title ">1.注册账号</h4>
                    <h4 class="title "><br> </h4>
                    <br>

                </div>
            </div>
            <div class="col-sm-3 ">
                <div class="our-whyus-item ">
                    <span style="font-size: 80px; " class="glyphicon glyphicon-pencil " aria-hidden="true "></span>

                    <h4 class="title ">2.填写个人信息</h4>
                    <h4 class="title "><br></h4>
                    <br>
                </div>
            </div>
            <div class="col-sm-3 ">
                <div class="our-whyus-item ">
                    <span style="font-size: 80px; " class="glyphicon glyphicon-thumbs-up " aria-hidden="true "></span>

                    <h4 class="title ">3.得到征信报告</h4>
                    <h4 class="title "><br></h4>
                    <br>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- STEP步骤 -->

<!-- 我们的优势 -->
<div class="index-row our-whyus ">
    <div class="container ">
        <div class="row ">
            <div class="col-sm-12 main-title ">
                <h1>OUR ADVANTAGES</h1>
                <h1>我们的优势</h1>
                <p class="line line-big "></p>
            </div>
            <div class="col-sm-6 ">
                <div class="our-whyus-item ">

                    <h2 class="title ">01</h2>

                    <p>针对农民，有针对性地设计出一整套新型指标。</p>
                    <br>
                </div>
            </div>
            <div class="col-sm-6 ">
                <div class="our-whyus-item ">

                    <h2 class="title ">02</h2>

                    <p>征信指标结合行为因素，考核点集中在偿债能力、信用和偿债潜力部分。</p>
                </div>
            </div>
            <div class="col-sm-12 ">
                <br>
            </div>
            <div class="col-sm-6 ">
                <div class="our-whyus-item ">

                    <h2 class="title ">03</h2>
                    <p>实地调研，数据可靠，模型合理。</p>
                    <br>
                </div>
            </div>
            <div class="col-sm-6 ">
                <div class="our-whyus-item ">
                    <h2 class="title ">04</h2>

                    <p>得出综合征信报告，给出是否借贷以及借贷金额的具体建议，得到在偿债能力、信用以及偿债潜力三个方面的具体情况。</p>
                </div>
            </div>
        </div>
    </div>
</div>
<!--我们的优势-->

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
