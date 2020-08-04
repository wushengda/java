package com.asiainfo.quickstart.web.task;

import com.asiainfo.bits.web.impexp.ImportTaskExecutor;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestImportTask extends ImportTaskExecutor {

    private static transient final Logger log = LoggerFactory.getLogger(TestImportTask.class);

    /**
    insert into wd_m_asynctask values('999999999', '测试导入任务', 'app-cluster-all', 'com.asiainfo.quickstart.web.task.TestImportTask', 300, 'U', 'quickstart', '测试导入任务', 'SUPERUSR')
    */

    /**
     * 导入任务，返回导入失败数据
     */
    @Override
    public List<Map<String, Object>> executeImport(Map<String, Object> param, List<Map<String, Object>> dataset) throws Exception {

        List<Map<String, Object>> errDs = new ArrayList<Map<String, Object>>();

        //todo 调服务将数据入库
        if(dataset != null){
            int size = dataset.size();

            log.info(">>>>>List<Map<String, Object>>>>>SIZE>>>" + size);
            for(int i = 0; i < size; i++){
                //Validate.verifyCell()
                log.info( JSONObject.fromObject(dataset.get(i)).toString() );
            }
        }

        return errDs;
    }

}
