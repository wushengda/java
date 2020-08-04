package com.asiainfo.quickstart.soa.demo.csv.interfaces;

import com.asiainfo.bits.aif.csf.annotations.*;

import java.util.Map;

public interface ISimpleQuerySoaCSV {
    /**
     * 简单查询示例
     * @param request
     * @return
     * @throws Exception
     */
    @Service(serviceCode = "soa_BsStaticData_query",
            name = "简单查询服务",
            desc = "简单查询服务示例",
            inMsg = @Msg(params = {
                    @Param(name = "CODE_TYPE",desc = "CODE_TYPE", type = ParamType.STRING, nullable = NullAbleType.NO),
            }),
            outMsg = @Msg(params = {
                    @Param(name = "CODE_TYPE",desc = "CODE_TYPE", type = ParamType.STRING ),
                    @Param(name = "CODE_VALUE",desc = "CODE_VALUE", type = ParamType.STRING ),
                    @Param(name = "CODE_NAME",desc = "CODE_NAME", type = ParamType.STRING ),
                    @Param(name = "STATE",desc = "STATE", type = ParamType.STRING ),
            }))
    public Map<String, Object> queryStaticDataByCodeType(Map<String, Object> request) throws Exception;

}
