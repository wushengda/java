package com.asiainfo.quickstart.app.service.impl;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.bits.aif.csf.context.CSFDatas;
import com.asiainfo.quickstart.app.repos.demo.dao.bsstaticdata.interfaces.IBsStaticDataDAO;
import com.asiainfo.quickstart.app.service.interfaces.ISimpleQuerySV;

import java.util.Map;

/**
 * AppFrame的查询服务
 * <p>
 * liaosheng@asiainfo.com
 * 2019/1/30
 */
public class SimpleQuerySVImpl implements ISimpleQuerySV {


    @Override
    public Map<String, Object> queryStaticDataByCodeType(Map<String, Object> request) throws Exception {
        // 获取请求报文内容
        String codeType = CSFDatas.getAsString(request, "CODE_TYPE");

        IBsStaticDataDAO dao = (IBsStaticDataDAO) ServiceFactory.getService(IBsStaticDataDAO.class);

        DataContainer[] result = dao.queryStaticDataByCodeType(codeType);
        return CSFDatas.create()
                .put("result", result)     // 将DataContainer[]转换成List
                .getData();
    }
}
