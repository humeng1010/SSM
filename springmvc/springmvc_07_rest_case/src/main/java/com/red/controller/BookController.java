package com.red.controller;

import com.red.pojo.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {


    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("Book save==>"+book);

        return "{'module':'book save success'}";
    }

    @GetMapping
    public List<Book> getAll(){
        Book book1 = new Book(1,"计算机1","计算机科学1","计算机的基础1");
        Book book2 = new Book(2,"计算机2","计算机科学2","计算机的基础2");
        Book book3 = new Book(3,"计算机3","计算机科学3","计算机的基础3");
        List<Book> books = new ArrayList<>();
        Collections.addAll(books,book1,book2,book3);
        return books;
    }
}
