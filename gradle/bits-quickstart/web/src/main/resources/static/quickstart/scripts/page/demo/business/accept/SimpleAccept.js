//绑定日历选择事件
$("#mydate").select(function(e){
    $("#BIRTHDAY").val(this.val());
    mypop.hide();
});

//绑定日历清除事件
$("#mydate").clear(function(e){
    $("#BIRTHDAY").val("");
});


function submitForm(){
    if(!$.validate.verifyAll('formCond'))
        return;

    $.beginPageLoading("正在提交...");
    $.ajax.submit("formCond", "accept", null, null, function(data, status, s){
        $.endPageLoading();
        MessageBox.success("", "业务受理成功", function(){
            closeNav();
        });
    }, function(code, info){
        $.endPageLoading();
        MessageBox.error("", code + "<br />" + info);
    });
}


$(function(){
    $("#chooseNumList").tap(function(e){
        var el = e.target;
        if(!el || !el.nodeType)
            return;
        var li = $(el).parents("li:first");
        if(!li || !li.length)
            return;

        $("#NUMBER").val(li.find("div.title:first").text());

        mypop.hide();
    });

    $("#choosePackageList").tap(function(e){
        var el = e.target;
        if(!el || !el.nodeType)
            return;
        var li = $(el).parents("li:first");
        if(!li || !li.length)
            return;

        $("#PACKAGE").val(li.find("div.title:first").text());

        mypop.hide();
    });
});