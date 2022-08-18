package com.red.config;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:jdbc.properties")
@ComponentScan("com.red")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
    
}
