package com.red.service.impl;

import com.red.service.BookService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("service...");
    }
}
