package com.red.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//3.创建springmvc的配置类，加载controller对应的bean
@Configuration
@ComponentScan("com.red")
public class SpringMvcConfig {
}
