package com.red;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.red.mapper.UserMapper;
import com.red.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplus01QuickstartApplicationTests {
    @Autowired
    private UserMapper userMapper;


    @Test
    void saveUser(){
        User user = new User();
        user.setName("张三");
        user.setPassword("123");
        user.setAge(22);
        user.setTel("15810200104");
        int count = userMapper.insert(user);
        System.out.println(count);
    }

    @Test
    void deleteUserById(){
        int count = userMapper.deleteById(1560913680189747202L);
        System.out.println(count);
    }

    @Test
    void testUpdate(){
        User user = new User();
        user.setId(1L);
        user.setName("张三");
        int count = userMapper.updateById(user);
        System.out.println(count);
    }

    @Test
    void testGetById(){
        User user = userMapper.selectById(1L);
        System.out.println(user);
    }

    @Test
    void testGetAll() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    void testGetByPage(){
        IPage page = new Page(1,2);
        userMapper.selectPage(page,null);
        System.out.println("当前页码值:"+page.getCurrent());
        System.out.println("每页显示数:"+page.getSize());
        System.out.println("一共多少页"+page.getPages());
        System.out.println("一共多少条数据"+page.getTotal());
        System.out.println("数据"+page.getRecords());
    }

}
