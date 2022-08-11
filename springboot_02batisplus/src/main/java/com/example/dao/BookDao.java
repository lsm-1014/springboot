package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domin.Book;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface BookDao extends BaseMapper<Book> {

//    @Select("select * from id where id = #{id}")
//    public Book bookDao(Integer id);
}
