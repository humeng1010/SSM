package com.red.service.impl;

import com.red.dao.BookDao;
import com.red.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    //提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();

    }


}
