/*********清空表单样式**************/
function reset_form(ele) {
    $(ele)[0].reset();
    $(ele).find("*").removeClass("has-error has-success");
    $(ele).find(".help-block").text("");
}


/*********弹出登录模态框*********/
$("#login_modal_btn").click(function () {
    reset_form("#login_modal form");
    //弹出模态框
    $("#login_modal").modal({
        backdrop:"static"//设置模态框不会因点击退出
    });
});

/***********关闭并弹出注册模态框*************/
$("#login_register_btn").click(function () {
    reset_form("#register_modal form");
    $("#login_modal").modal('hide');
    $("#register_modal").modal({
        backdrop:"static"//设置模态框不会因点击退出
    });
});

/**根据输入校验进行DOM操作*/
function  show_validate_msg(ele,status,msg) {
    $(ele).parent().removeClass("has-success has-error");
    $(ele).next("span").text("");
    if(status=="success"){
        $(ele).parent().addClass("has-success");
        $(ele).next("span").text(msg);
    }else if(status=="error"){
        $(ele).parent().addClass("has-error");
        $(ele).next("span").text(msg);
    }
}

/********校验表单数据***********/
function validate_adds_form() {
    //校验身份证
    var id=$("#login_id_input").val();
    var regId=/^\d{17}(\d|x)$/;
    if(!regId.test(id)){
        show_validate_msg("#login_id_input","error","请输入正确身份证号");
        return false;
    }else{
        show_validate_msg("#login_id_input","success","");
    }

    //校验密码
    var password=$("#login_password_input").val();
    var regPassword=/^[\w]{6,16}$/;
    if(!regPassword.test(password)){
        show_validate_msg("#login_password_input","error","请输入6-16位数字，字母，下划线的组合");
        return false;
    }else{
        show_validate_msg("#login_password_input","success","");
    }

    return true;
}



/*********模态框登录按钮*********/
$("#login_btn").click(function () {

    var pathName = document.location.pathname;
    var index = pathName.substr(1).indexOf("/");
    var path = pathName.substr(0,index+1)+"/login";//获取路径

    if(!validate_adds_form()){
        return false;
    }
    $.ajax({
        url:path,
        type:"POST",
        data:$("#login_modal form").serialize(),//序列化表格数据为json
        success:function (result) {
            if (result.code == 100) {
                $("#login_modal").modal('hide');
                window.location.reload();
            } else {
                show_validate_msg("#login_id_input", "error","账号或密码错误，请检查后输入");
                show_validate_msg("#login_password_input", "error","账号或密码错误，请检查后输入");
            }
        }
    });
});

