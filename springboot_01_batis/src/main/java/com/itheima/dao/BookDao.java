package com.itheima.dao;



import com.itheima.domin.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface BookDao {

    @Select("select * from id where id = #{id}")
    public Book getById(Integer id);
}
