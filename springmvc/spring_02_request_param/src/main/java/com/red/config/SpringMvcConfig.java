package com.red.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//3.创建springmvc的配置类，加载controller对应的bean
@Configuration
@ComponentScan("com.red.controller")
@EnableWebMvc//功能非常多，这里是开启json数据转对象
public class SpringMvcConfig {
}
