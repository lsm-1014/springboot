package com.itheima.utils;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class UtilsCode {

    private String path[] = {"000000","00000","0000","000","00","0",""};

    public String generator(String tele){
        int hash = tele.hashCode();
        int encryption = 20208888;
        long result = hash ^ encryption;
        long nowTime =System.currentTimeMillis();
        result = result ^ nowTime;
        long code = result % 1000000;
        code = code < 0 ? -code : code;
        String codeStr = code + "";
        int len = codeStr.length();
        return path[len] + codeStr;
    }

    @Cacheable(value = "smsCode",key = "#tele")
    public String get(String tele){
        return null;
    }
//
//    public static void main(String[] args) {
//        UtilsCode uc = new UtilsCode();
//        String s = uc.generator("18688889999");
//        System.out.println(s);
//    }
}
