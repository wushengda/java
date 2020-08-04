package com.asiainfo.quickstart.web.handler;

import com.asiainfo.bits.web.HttpHandler;

/**
 * TODO:
 * <p>
 * liaosheng@asiainfo.com
 * 2019-06-19 20:33
 */
public class QueryHandler extends HttpHandler {

    public String hello() throws Exception {

        getData().getString("SSS");
        return "xx";
    }


    public boolean isVIP() {
        return true;
    }
}
