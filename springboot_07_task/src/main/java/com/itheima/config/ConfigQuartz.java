//package com.itheima.config;
//
//import com.itheima.quartz.MyQuartz;
//import org.quartz.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ConfigQuartz {
//
//    @Bean
//    public JobDetail jobDetail(){
//        //绑定具体的工作
//        return JobBuilder.newJob(MyQuartz.class).storeDurably().build();
//    }
//
//    @Bean
//    public Trigger trigger(){
//        //绑定具体的工作明细
//        ScheduleBuilder schedBuilder = CronScheduleBuilder.cronSchedule("0/5 * * * * ?");
//        return TriggerBuilder.newTrigger().forJob(jobDetail()).withSchedule(schedBuilder).build();
//    }
//}
