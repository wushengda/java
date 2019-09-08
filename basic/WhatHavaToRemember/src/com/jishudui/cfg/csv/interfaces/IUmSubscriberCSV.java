package com.jishudui.cfg.csv.interfaces;


import annotation.Msg;
import annotation.NullAbleType;
import annotation.Param;
import annotation.ParamType;
import annotation.Service;

import java.util.Map;

public interface IUmSubscriberCSV
{

    @Service(serviceCode = "order_IUmSubscriberCSV_querySubsciber",
            name = "根据条件查询用户实例",
            desc = "根据条件查询用户实例,根据条件查询",
            inMsg = @Msg(params = {
                    @Param(name = "ACCESS_NUM",desc = "用户号码", type = ParamType.STRING, nullable = NullAbleType.YES),
                    @Param(name = "SUBSCRIBER_INS_ID",desc = "用户编码", type = ParamType.STRING, nullable = NullAbleType.YES),
                    @Param(name = "CUST_ID",desc = "客户编码", type = ParamType.STRING, nullable = NullAbleType.YES),
            }),
            outMsg = @Msg(params = {
                    @Param(name = "OUT_DATA",desc = "返回结果集", type = ParamType.MAP )
            }))
    public Map querySubsciber(Map input) throws Exception;
}
