package com.red.controller;

import com.red.exception.BusinessException;
import com.red.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice//声明这个类是处理REST风格开发的异常处理类
public class ProjectExceptionAdvice {

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException exception){

        return new Result(exception.getCode(),null,exception.getMessage());
    }

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException exception){
        //记录日志
        //发送邮件通知开发人员
        //发送短信给运维人员
        return new Result(exception.getCode(),null,exception.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result doException(Exception exception){
        //记录日志
        //发送邮件通知开发人员
        //发送短信给运维人员
        return new Result(666,null,"出现异常了"+exception.getMessage());
    }
}
