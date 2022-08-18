package com.red;

import com.red.config.SpringConfig;
import com.red.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bean = applicationContext.getBean(BookDao.class);
        bean.update();
    }
}
