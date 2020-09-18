package com.wistronits.demo0902;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)//// 定义路由 告诉前端怎么访问到该方法  GET的形式：即url直接传参的方式去接受请求
    public String hello(){
        return "Hello SpringBoot!";
    }
}
