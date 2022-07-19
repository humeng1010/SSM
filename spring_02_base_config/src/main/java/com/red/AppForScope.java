package com.red;

import com.red.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {
    public static void main(String[] args) {
//        获取IOC容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService1 = applicationContext.getBean("bookService", BookService.class);
        BookService bookService2 = applicationContext.getBean("bookService", BookService.class);
        System.out.println(bookService1);
        System.out.println(bookService2);

    }
}
