package com.red.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ProjectException {

    @ExceptionHandler(Exception.class)
    public String doException(Exception exception){
        return "err";
    }
}
