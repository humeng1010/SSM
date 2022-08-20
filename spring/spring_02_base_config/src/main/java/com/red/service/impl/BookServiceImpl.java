package com.red.service.impl;

import com.red.dao.BookDao;
import com.red.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;

    //提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
        System.out.println("set ...");
    }

    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();

    }

    /**
     * 在属性值注入之后
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy");
    }


}
