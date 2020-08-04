package com.asiainfo.quickstart.app.repos.demo.dao.bsstaticdata.impl;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.bits.express.rse.RSExpressDAO;
import com.asiainfo.quickstart.app.repos.demo.dao.bsstaticdata.interfaces.IBsStaticDataDAO;

import java.util.HashMap;
import java.util.Map;

public class BsStaticDataDAOImpl extends RSExpressDAO implements IBsStaticDataDAO {

    @Override
    public DataContainer[] queryStaticDataByCodeType(String codeType) throws Exception {
        Map<String, Object> param = new HashMap<>();
        param.put("CODE_TYPE", codeType);
        return this.executeQuery( "SEL_BS_STATICDATA_BY_CODETYPE", param);
    }
}
