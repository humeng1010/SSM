package com.red.service.impl;

import com.red.dao.BookDao;
import com.red.pojo.Book;
import com.red.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public Book getById(Integer id) {
        return bookDao.getById(id);
    }
}
