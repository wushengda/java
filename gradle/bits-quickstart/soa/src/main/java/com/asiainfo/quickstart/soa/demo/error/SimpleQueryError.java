package com.asiainfo.quickstart.soa.demo.error;

import com.asiainfo.bits.exceptions.ErrorCode;
import com.asiainfo.bits.i18n.I18NCode;

/**
 * TODO:
 * <p>
 * liaosheng@asiainfo.com
 * 2019-07-30 19:07
 */
public enum SimpleQueryError implements ErrorCode {

    /**
     * 测试异常编码
     */
    @I18NCode(zh_CN = "测试异常", en_US = "Test Error")
    SIMPLE_QUERY_ERROR
}
