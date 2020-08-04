package com.asiainfo.quickstart.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.asiainfo.quickstart", "com.asiainfo.bits", "com.wade.springboot"})
public class Application extends SpringBootServletInitializer {

    /**
     * 开发参数配置
     *  增加JVM参数 -Dcsf.client.name=xxx 才能远程调用
     *  增加JVM参数 -Dorg.apache.tapestry.disable-caching=true 禁用tapestry缓存
     *  增加JVM参数 -javaagent:library/spring/springloaded-1.2.8.RELEASE.jar -noverify 启用springloaded-热加载
     *  也可以使用Idea的JRebel插件来做热加载，效果更好
     *  JRebel如何使用
     * @param args
     */
    public static void main(String[] args) {
        //System.setProperty("csf.client.name", "client-test-node01");
        System.setProperty("org.apache.tapestry.disable-caching", "true");
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}
