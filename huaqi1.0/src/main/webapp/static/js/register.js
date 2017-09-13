/*********清空表单样式**************/
function reset_form(ele) {
    $(ele)[0].reset();
    $(ele).find("*").removeClass("has-error has-success");
    $(ele).find(".help-block").text("");
}

/*********弹出注册模态框*********/
/*$("#register_modal_btn").click(function () {
    //表单重置
    reset_form("#register_modal form");
    //弹出模态框
    $("#register_modal").modal({
        backdrop:"static"//设置模态框不会因点击退出
    });
})*/

/********校验表单数据***********/
function validate_add_form() {
    //校验身份证
    var id=$("#reg_id_input").val();
    var regId=/^\d{17}(\d|x)$/;
    if(!regId.test(id)){
        show_validate_msg("#reg_id_input","error","请输入正确身份证号如无身份证请自创18位数字ID");
        return false;
    }else{
        show_validate_msg("#reg_id_input","success","");
    }

    //校验姓名
    var userName=$("#reg_userName_input").val();
    var regUserName=/^[\u4e00-\u9fa5]{2,20}$/;
    if(!regUserName.test(userName)){
        show_validate_msg("#reg_userName_input","error","请输入合法姓名");
        return false;
    }else{
        show_validate_msg("#reg_userName_input","success","");
    }

    //校验密码
    var password=$("#reg_password_input").val();
    var regPassword=/^[\w]{6,16}$/;
    if(!regPassword.test(password)){
        show_validate_msg("#reg_password_input","error","请输入6-16位数字，字母，下划线的组合");
        return false;
    }else{
        show_validate_msg("#reg_password_input","success","");
    }

    //校验邮箱
    var email=$("#reg_email_input").val();
    var regEmail=/^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
    if(!regEmail.test(email)){
        show_validate_msg("#reg_email_input","error","请输入正确email");
        return false;
    }else{
        show_validate_msg("#reg_email_input","success","");
    }

    //校验手机号
    var tel=$("#reg_tel_input").val();
    var regTel=/^[1][3,4,5,7,8][0-9]{9}$/;
    if(!regTel.test(tel)){
        show_validate_msg("#reg_tel_input","error","请输入正确手机号码");
        return false;
    }else{
        show_validate_msg("#reg_tel_input","success","");
    }
    return true;
}

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

/**********Id数据库重复性检测******************/
$("#reg_id_input").change(function () {
    var pathName = document.location.pathname;
    var index = pathName.substr(1).indexOf("/");
    var path = pathName.substr(0,index+1)+"/checkId";//获取路径
    var id=this.value;
    $.ajax({
        url:path,
        type:"POST",
        data:"id="+id,
        success:function (result) {
           if(result.code==100){
               show_validate_msg("#reg_id_input","success","号码可用");
               $("#register_btn").attr("ajax-va","success");
           }
           else{
               show_validate_msg("#reg_id_input","error",result.extend.va_msg);
               $("#register_btn").attr("ajax-va","error");
           }
        }
    });
});

/*********模态框注册按钮*********/
$("#register_btn").click(function () {
//1.提交信息给服务器保存
//2.发送ajax请求保存员工
    var pathName = document.location.pathname;
    var index = pathName.substr(1).indexOf("/");
    var path = pathName.substr(0,index+1)+"/register";//获取路径
    if(!validate_add_form()){
        return false;
    }
    if($(this).attr("ajax-va")=="error"){
        return false;
    }
    $.ajax({
        url:path,
        type:"POST",
        data:$("#register_modal form").serialize(),//序列化表格数据为json
        success:function (result) {
            if (result.code == 100) {
                alert("注册成功!!!");
                window.location.href="index.jsp";
            } else {
                //显示失败信息
                if (undefined != result.extend.errorFields.id) {
                    //显示Id错误信息
                    show_validate_msg("#reg_id_input", "error", result.extend.errorFields.id);
                }
                if (undefined != result.extend.errorFields.password) {
                    //显示Id错误信息
                    show_validate_msg("#reg_password_input", "error", result.extend.errorFields.password);
                }
                if (undefined != result.extend.errorFields.email) {
                    //显示邮箱错误信息
                    show_validate_msg("#reg_email_input", "error", result.extend.errorFields.email);
                }
                if (undefined != result.extend.errorFields.userName) {
                    //显示姓名的错误信息
                    show_validate_msg("#reg_userName_input", "error", result.extend.errorFields.userName);
                }
                if (undefined != result.extend.errorFields.tel) {
                    //显示号码错误信息
                    show_validate_msg("#reg_tel_input", "error", result.extend.errorFields.tel);
                }
            }
        }
    });
});