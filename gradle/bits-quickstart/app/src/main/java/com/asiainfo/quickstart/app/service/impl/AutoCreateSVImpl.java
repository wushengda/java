package com.asiainfo.quickstart.app.service.impl;

import com.asiainfo.quickstart.app.service.interfaces.IAutoCreateSV;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * AppFrame的查询服务
 * <p>
 * liaosheng@asiainfo.com
 * 2019/1/30
 */
public class AutoCreateSVImpl implements IAutoCreateSV {

    private static final Logger log = LoggerFactory.getLogger(AutoCreateSVImpl.class);


    @Override
    public Map<String, Object> query(Map<String, Object> request) throws Exception {
        log.debug("Auto Create Query");
        return null;
    }

    @Override
    public Map<String, Object> insert(Map<String, Object> request) throws Exception {
        log.debug("Auto Create Insert");
        return null;
    }
}
