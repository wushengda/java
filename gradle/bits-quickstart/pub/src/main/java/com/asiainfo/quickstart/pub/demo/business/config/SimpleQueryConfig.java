package com.asiainfo.quickstart.pub.demo.business.config;

import com.asiainfo.bits.configure.Configuration;

import java.util.List;

@Configuration("quickstart.demo.simplequery")
public class SimpleQueryConfig {

    private String name;

    private String code;

    private int age;

    /**
     * 验证复杂的对象依赖
     */
    private List<SimpleQueryItem> items;


    /**
     * 必须要有默认的构造函数，否则创建的对像为空
     */
    public SimpleQueryConfig() {}

    public String getName() {
        return name;
    }

    /**
     * set 的方法必须是 public 的，否则值为NULL
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<SimpleQueryItem> getItems() {
        return items;
    }

    public void setItems(List<SimpleQueryItem> items) {
        this.items = items;
    }

}
