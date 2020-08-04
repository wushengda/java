package com.asiainfo.quickstart.app.repos.demo.dao.bsstaticdata.interfaces;

import com.ai.appframe2.bo.DataContainer;

public interface IBsStaticDataDAO {

    public DataContainer[] queryStaticDataByCodeType(String codeType) throws Exception;
}
