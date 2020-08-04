package com.asiainfo.quickstart.pub.demo.business.config;

import com.alibaba.fastjson.annotation.JSONField;


/**
 * 子对象引用，也可以单独写个Java POJO类
 */
public class SimpleQueryItem {

    /**
     * 当 Java 属性和yaml配置不匹配时，可通过注解来映射
     */
    @JSONField(name = "name")
    private String itemName;

    /**
     * 当 Java 属性和yaml配置不匹配时，可通过注解来映射
     */
    @JSONField(name = "value")
    private int itemValue;

    /**
     * 同样必须要有默认的构造函数
     */
    public SimpleQueryItem() {

    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemValue() {
        return itemValue;
    }

    public void setItemValue(int itemValue) {
        this.itemValue = itemValue;
    }

}
