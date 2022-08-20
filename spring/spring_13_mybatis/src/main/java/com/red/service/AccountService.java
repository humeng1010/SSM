package com.red.service;

import com.red.pojo.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountService {
    void save(Account account);
    void update(Account account);
    void delete(Integer id);
    Account findById(Integer id);
    List<Account> findAll();
}
