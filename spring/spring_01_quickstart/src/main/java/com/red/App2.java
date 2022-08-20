package com.red;

import com.red.dao.BookDao;
import com.red.service.BookService;
import com.red.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
//        获取IOC容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
//        bookDao.save();
//        获取bean
        BookService bookService = applicationContext.getBean("bookService", BookService.class);
        bookService.save();

    }
}
