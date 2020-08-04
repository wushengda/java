package com.asiainfo.quickstart.soa.demo.csv.impl;

import com.asiainfo.bits.aif.csf.client.CenterClient;
import com.asiainfo.bits.exceptions.Throws;
import com.asiainfo.quickstart.soa.demo.csv.interfaces.ISimpleQuerySoaCSV;
import com.asiainfo.quickstart.soa.demo.error.SimpleQueryError;

import java.util.Map;

public class SimpleQuerySoaCSVImpl implements ISimpleQuerySoaCSV {

    public Map<String, Object> queryStaticDataByCodeType(Map<String, Object> request) throws Exception{

        Throws.error(SimpleQueryError.SIMPLE_QUERY_ERROR);

        return CenterClient.call("Demo_BsStaticData_query",request);
    }

}
