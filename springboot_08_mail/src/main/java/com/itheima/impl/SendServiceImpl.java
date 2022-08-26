package com.itheima.impl;

import com.itheima.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Resource
@Service
public class SendServiceImpl implements SendService {

    @Autowired
    private JavaMailSender javaMailSender;

    private String from = "3050491673@qq.com";
    private String to = "az288100@163.com";
    private String subject = "测试邮件";
    private String context = "接收测试邮件";

    @Override
    public void sendMail() {
        SimpleMailMessage massage = new SimpleMailMessage();
        massage.setFrom(from);
        massage.setTo(to);
        massage.setSubject(subject);
        massage.setText(context);
        javaMailSender.send(massage);
    }
}
