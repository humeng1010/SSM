package com.red.controller;

import com.red.pojo.Address;
import com.red.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {
    /**
     * 普通参数
     * @return
     * @param name
     * @param age
     */
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name,int age){
        System.out.println("普通参数传递 name=="+name);
        System.out.println("普通参数传递 age=="+age);
        return "{'module': 'common param'}";
    }

    /**
     * 请求参数与形参名称不同使用@RequestParam("name")指定请求名称与形参的关系
     * @param username
     * @param age
     * @return
     */
    @RequestMapping("/commonParamDifferentName")
    @ResponseBody
    public String commonParamDifferentName(@RequestParam("name") String username, Integer age){
        System.out.println("普通参数传递 name=="+username);
        System.out.println("普通参数传递 age=="+age);
        return "{'module': 'commonParamDifferentName'}";
    }

    /**
     * 接收实体类参数
     * @param user
     * @return
     */
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user){
        System.out.println("pojo参数传递 user=="+user);
        return "{'module': 'pojoParam'}";
    }

    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes){
        System.out.println("array参数传递 likes==="+ Arrays.toString(likes));
        return "{'module': 'arrayParam'}";
    }

    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes){
        System.out.println("array参数传递 likes==="+likes);
        return "{'module': 'listParam'}";
    }

    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes){
        System.out.println("array参数传递 likes==="+likes);
        return "{'module': 'listParamForJson'}";
    }

    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user){
        System.out.println("array参数传递 likes==="+user);
        return "{'module': 'pojoParamForJson'}";
    }

    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> users){
        System.out.println("array参数传递 likes==="+users);
        return "{'module': 'listPojoParamForJson'}";
    }

    @RequestMapping("/user2json")
    @ResponseBody
    public User user2json(){
        User user = new User();
        user.setName("张三");
        user.setAge(22);
        return user;
    }

}
