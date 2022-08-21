package com.itheima.doman;

import lombok.Data;
//get/set方法  tostring方法 hashCode方法  equals方法
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;


}
