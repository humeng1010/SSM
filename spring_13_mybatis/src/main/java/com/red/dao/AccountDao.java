package com.red.dao;

import com.red.pojo.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {
    @Insert("insert into tbl_account (name, money) values (#{name},#{money});")
    void save(Account account);
    @Update("update tbl_account set money = #{money},name = #{name} where id = #{id};")
    void update(Account account);
    @Delete("delete from tbl_account where id = #{id};")
    void delete(Integer id);
    @Select("select * from tbl_account where id = #{id};")
    Account findById(Integer id);
    @Select("select * from tbl_account;")
    List<Account> findAll();
}