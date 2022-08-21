package com.red.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.red.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper extends BaseMapper<User> {

//    @Update("update user set deleted = 0 where id = #{id} and deleted = 1;")
    void recoverUser(Integer id);
}
