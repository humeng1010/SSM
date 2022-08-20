package com.red;

import com.red.dao.BookDao;
import com.red.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
//        bookDao.save();
        BookService bookService = (BookService) applicationContext.getBean("bookService");
        bookService.save();
//        applicationContext.close();
        applicationContext.registerShutdownHook();
    }
}
