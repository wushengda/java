package com.asiainfo.quickstart.app.csv.demo.service.impl;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.quickstart.app.csv.demo.service.interfaces.IAutoCreateCSV;
import com.asiainfo.quickstart.app.service.interfaces.IAutoCreateSV;

import java.util.Map;

public class AutoCreateCSVImpl implements IAutoCreateCSV {
    @Override
    public Map<String, Object> query(Map<String, Object> request) throws Exception {
        IAutoCreateSV autoCreateSV = (IAutoCreateSV) ServiceFactory.getService(IAutoCreateSV.class);
        return autoCreateSV.query(request);
    }

    @Override
    public Map<String, Object> insert(Map<String, Object> request) throws Exception {
        IAutoCreateSV autoCreateSV = (IAutoCreateSV) ServiceFactory.getService(IAutoCreateSV.class);
        return autoCreateSV.insert(request);
    }
}
