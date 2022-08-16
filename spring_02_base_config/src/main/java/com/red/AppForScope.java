package com.red;

import com.red.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {
    public static void main(String[] args) {
//        获取IOC容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) applicationContext.getBean("bookService");
        BookService bookService1 = applicationContext.getBean("bookService", BookService.class);
//        多例模式，实例不一样
        System.out.println(bookService == bookService1);



    }
}
