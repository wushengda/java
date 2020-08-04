package com.asiainfo.quickstart.app.service.interfaces;

import java.util.Map;

/**
 * 开发规范要求添加，否则无法启动AppFrame的事务
 * <p>
 * liaosheng@asiainfo.com
 * 2019/1/30
 */
public interface ISimpleQuerySV {


    /**
     * 查询示例
     * @return
     */
    public Map<String, Object> queryStaticDataByCodeType(Map<String, Object> request) throws Exception ;



}
