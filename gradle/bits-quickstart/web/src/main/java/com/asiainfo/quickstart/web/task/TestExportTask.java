package com.asiainfo.quickstart.web.task;

import com.asiainfo.bits.web.impexp.ExportTaskExecutor;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.ss.usermodel.*;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestExportTask extends ExportTaskExecutor {

    private static final transient Logger log = LoggerFactory.getLogger(TestExportTask.class);

    /**
    insert into wd_m_asynctask values('999999998', '测试导出任务', 'app-cluster-all', 'com.asiainfo.quickstart.web.task.TestExportTask', 300, 'U', 'quickstart', '测试导出任务', 'SUPERUSR')
    */

    @Override
    public List<Map<String, Object>> executeExport(Map<String, Object> param, long start, long end) throws Exception {

        //todo 调服务返回要导出的数据
        log.info("-------TaskExportTask---" + start + "," + end);

        List<Map<String, Object>> tasks = new ArrayList<Map<String, Object>>();

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("TASK_MODULE_ID", "11111");
        data.put("TASK_NAME", "TASK_NAME");
        data.put("FUNC_CODE", "FUNC_CODE");
        data.put("DEV_STAFF_ID", "SUPERUSR");
        data.put("DEV_START_TIME", "2016-03-10");
        data.put("DEV_END_TIME", "2016-03-20");
        data.put("DEV_DESC", "备注");
        tasks.add(data);

        return tasks;
    }

}
