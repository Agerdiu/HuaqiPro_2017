/*********保存按钮*********/
$("#save-btn").click(function () {
//1.提交信息给服务器保存
//2.发送ajax请求保存员工
    var pathName = document.location.pathname;
    var index = pathName.substr(1).indexOf("/");
    var path = pathName.substr(0,index+1)+"/changeInfo";//获取路径
    if(!validate_add_form()){
        return false;
    }
   var par;
   par="userName="+$("input#change_userName_input").val();
   par+="&gender="+$("input[name=gender]").val();
   par+="&password="+$("input#change_password_input").val();
   par+="&email="+$("input#change_email_input").val();
   par+="&tel="+$("input#change_tel_input").val();
    //alert(par);
    /*var params = JSON.stringify(par);
    alert(params);*/
    $.ajax({
        url:path,
        type:"POST",
        data:par,//序列化表格数据为json
        success:function (result) {
            alert("finish");
        }
    });
});

/********校验表单数据***********/
function validate_add_form() {
//校验姓名
    var userName=$("#change_userName_input").val();
    var changeUserName=/^[\u4e00-\u9fa5]{2,20}$/;
    if(!changeUserName.test(userName)){
        alert("请输入合法姓名");
        return false;
    }
    //校验密码
    var password=$("#change_password_input").val();
    var changePassword=/^[\w]{6,16}$/;
    if(!changePassword.test(password)){
        alert("请输入6-16位数字，字母，下划线的组合");
        return false;
    }

    //校验邮箱
    var email=$("#change_email_input").val();
    var changeEmail=/^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
    if(!changeEmail.test(email)){
        alert("请输入正确email");
        return false;
    }

    //校验手机号
    var tel=$("#change_tel_input").val();
    var changeTel=/^[1][3,4,5,7,8][0-9]{9}$/;
    if(!changeTel.test(tel)){
        alert("请输入正确手机号码");
        return false;
    }
return true;
}