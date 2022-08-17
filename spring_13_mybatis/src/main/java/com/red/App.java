package com.red;

import com.red.config.SpringConfig;
import com.red.pojo.Account;
import com.red.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = applicationContext.getBean(AccountService.class);
        Account byId = accountService.findById(2);
        System.out.println(byId);
    }
}
