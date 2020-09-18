package com.wistronits.demo0902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})//@SpringBootApplication这个标签说明Demo0902Application这个类是Springboot的启动类
public class Demo0902Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo0902Application.class, args);
    }

}
