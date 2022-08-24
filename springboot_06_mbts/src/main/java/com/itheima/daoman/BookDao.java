package com.itheima.daoman;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.dao.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {
}
