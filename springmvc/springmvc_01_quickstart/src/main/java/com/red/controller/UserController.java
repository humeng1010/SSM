package com.red.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//2.定义controller
@Controller//定义bean
public class UserController {
    //2.2设置当前操作访问路径
    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("user module save is running...");
        return "{'module': 'springmvc'}";
    }
}
