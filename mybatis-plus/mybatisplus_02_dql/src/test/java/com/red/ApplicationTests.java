package com.red;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.red.entity.User;
import com.red.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void testGetAll() {
        //方式一:按条件查询
//        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        wrapper.lt("age",25);
//        List<User> users = userMapper.selectList(wrapper);
//        System.out.println(users);

        //方式二:Lambda格式条件查询
//        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        wrapper.lambda().lt(User::getAge,25);
//        List<User> users = userMapper.selectList(wrapper);
//        System.out.println(users);

        //方式三:Lambda方式查询
//        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
//        wrapper.lt(User::getAge,25);
//        List<User> users = userMapper.selectList(wrapper);
//        System.out.println(users);
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
//        wrapper.lt(User::getAge,25);
//        wrapper.gt(User::getAge,21);
        //小于25并且大于21
//        wrapper.lt(User::getAge,25).gt(User::getAge,21);//并且关系
        //小于21或者大于25
        wrapper.lt(User::getAge,21).or().gt(User::getAge,25);//或者关系
        List<User> users = userMapper.selectList(wrapper);
        System.out.println(users);
    }

}
