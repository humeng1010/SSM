package com.red;

import com.red.config.SpringConfig;
import com.red.dao.BookDao;
import com.red.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
        System.out.println(bookDao);
        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService);

    }
}
