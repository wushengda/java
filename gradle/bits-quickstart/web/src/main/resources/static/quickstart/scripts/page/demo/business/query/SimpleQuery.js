function queryList(){
    if(!$.validate.verifyAll("queryCond"))
        return;

    //加载页面时进行查询
    $.beginPageLoading("正在查询数据..");
    $.ajax.submit("queryCond", "queryList", null, "queryPart", function(data, status, s){
        $.endPageLoading();
    }, function(code, info){
        $.endPageLoading();
        MessageBox.error("", code + "<br />" + info);
    });


    $.ajax.httphandler("com.asiainfo.quickstart.web.handler", "hello", "&a=b&c=d", function(data, status, s){
        $.endPageLoading();
    }, function(code, info){
        $.endPageLoading();
        MessageBox.error("", code + "<br />" + info);
    });
}