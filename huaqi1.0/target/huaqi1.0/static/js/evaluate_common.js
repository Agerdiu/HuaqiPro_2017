function submitted(){
    var pathName = document.location.pathname;
    var index = pathName.substr(1).indexOf("/");
    var path = pathName.substr(0,index+1)+"/evaluate_common";//获取路径
    var test = $("#zxbd form").serialize();
    if($(this).attr("ajax-va")=="error"){
        return false;
    }
    alert(test);
    $.ajax({
        url:path,
        type:"POST",
        data:$("#zxbd form").serialize(),//序列化表格数据为json
        success:function (result) {
            if (result.code == 100) {
                alert("提交成功");
            } else {
                alert("提交失败!!!")
            }
        }
    });
};