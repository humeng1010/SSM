package com.red;

import com.red.dao.BookDao;
import com.red.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
        System.out.println(bookDao);
        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService);

    }
}
