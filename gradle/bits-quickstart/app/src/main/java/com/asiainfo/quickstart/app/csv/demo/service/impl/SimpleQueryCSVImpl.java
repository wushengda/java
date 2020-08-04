package com.asiainfo.quickstart.app.csv.demo.service.impl;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.quickstart.app.csv.demo.service.interfaces.ISimpleQueryCSV;
import com.asiainfo.quickstart.app.service.interfaces.ISimpleQuerySV;

import java.util.Map;

/**
 * 简单查询示例
 *
 * <p>liaosheng@asiainfo.com 2019/1/30
 */
public class SimpleQueryCSVImpl implements ISimpleQueryCSV {

  @Override
  public Map<String, Object> queryStaticDataByCodeType(Map<String, Object> request)
      throws Exception {
    ISimpleQuerySV sv = (ISimpleQuerySV) ServiceFactory.getService(ISimpleQuerySV.class);
    return sv.queryStaticDataByCodeType(request);
  }
}
