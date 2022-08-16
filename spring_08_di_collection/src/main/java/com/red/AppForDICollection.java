package com.red;

import com.red.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDICollection {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = applicationContext.getBean("bookDao", BookDao.class);
        bookDao.save();
    }
}
