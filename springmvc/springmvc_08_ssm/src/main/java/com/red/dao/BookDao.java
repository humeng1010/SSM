package com.red.dao;

import com.red.pojo.Book;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {
    /**
     * 如果查询参数返回值的名称与实体类的属性名称不匹配，可以使用注解定义映射关系
     *
     */
//    @Results(id = "bookResultMap",value = {
//            @Result(column = "name",property = "name"),
//            @Result(column = "description",property = "description")
//    })
    @Insert("insert into tbl_book (type, name, description) values (#{type},#{name},#{description});")
    void save(Book book);
    @Update("update tbl_book set type = #{type}, name = #{name}, description = #{description} where id = #{id} ;")
    void update(Book book);
    @Delete("delete from tbl_book where id = #{id};")
    void delete(Integer id);
    //使用ResultMap定义返回值映射类型
//    @ResultMap("bookResultMap")
    @Select("select * from tbl_book where id = #{id};")
    Book getById(Integer id);
//    @ResultMap("bookResultMap")
    @Select("select * from tbl_book;")
    List<Book> getAll();
}
