package com.itheima.controller.utils;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Advice {
    //拦截所有的异常信息
    @ExceptionHandler
    public R doException(Exception ex){
        return new R("服务器故障，请联系管理员");
    }
}
