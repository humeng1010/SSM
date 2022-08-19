package com.red.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

//4.定义一个Servlet容器启动的配置类，在里面加载spring的配置
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    /**
     * 加载springmvc配置的
     * @return
     */
    @Override
    protected WebApplicationContext createServletApplicationContext() {
//        AnnotationConfigApplicationContext 注意区别
//        springmvc需要加载对应的AnnotationConfigWebApplicationContext
        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(SpringMvcConfig.class);
        return webApplicationContext;
    }

    /**
     * 用来设置哪些请求归属springmvc处理
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        //所有请求归springmvc处理
        return new String[]{"/"};
    }

    /**
     * 加载spring容器配置
     * @return
     */
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
