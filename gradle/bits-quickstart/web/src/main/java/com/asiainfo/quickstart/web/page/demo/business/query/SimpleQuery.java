package com.asiainfo.quickstart.web.page.demo.business.query;

import com.ailk.common.data.IData;
import com.ailk.common.data.IDataset;
import com.asiainfo.bits.configure.BitsConfigure;
import com.asiainfo.bits.web.Page;
import com.asiainfo.bits.web.Visit;
import com.asiainfo.bits.web.util.CenterClient4Web;
import com.asiainfo.quickstart.pub.demo.business.config.SimpleQueryConfig;
import org.apache.tapestry.IRequestCycle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class SimpleQuery extends Page {

    private static final transient Logger log = LoggerFactory.getLogger(SimpleQuery.class);

    public abstract void setInfos(IDataset infos);
    public abstract void setInfoCount(long infoCount);

    public void queryList(IRequestCycle cycle) throws Exception{
        SimpleQueryConfig config = BitsConfigure.getInstance().getConfig(SimpleQueryConfig.class);
        if (log.isDebugEnabled()) {
            log.debug("read yaml config:  " + config.toString());

            log.debug("read yaml config: {} ", config.getName());
            log.debug("read yaml config: {} ", config.getCode());
            log.debug("read yaml config: {} ", config.getAge());

            config.getItems().forEach(item -> log.debug("read yaml config: {}={}", item.getItemName(), item.getItemValue()));
        }


        // Session
        Visit visit = getVisit();
        visit.getOperatorId();
        visit.getOperatorName();

        visit.setAttr("SN", "122113131");
        visit.get("SN");

        // 服务调用
        IData response = CenterClient4Web.call("soa_BsStaticData_query", getData());

        // 设置表格数据，自动转换成IDataset
        setInfos(response.getDataset("result"));

        // 设置分页Count数据
        setInfoCount(response.getLong("count"));
    }

}
