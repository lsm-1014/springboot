package com.itheima;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.config.ServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springboot02ConfigurationApplication {

    @Bean
    @ConfigurationProperties(prefix = "datasource")
    public DruidDataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        return ds;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext cac = SpringApplication.run(Springboot02ConfigurationApplication.class, args);
        ServerConfig bean = cac.getBean(ServerConfig.class);
        System.out.println(bean);
        DruidDataSource ds  = cac.getBean(DruidDataSource.class);
        System.out.println(ds.getDriverClassName());
    }

}
