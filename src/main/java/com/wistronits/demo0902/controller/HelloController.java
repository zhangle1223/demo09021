package com.wistronits.demo0902.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Package: com.wistronits.demo0902.controller
 * @ClassName: HelloController
 * @Author: 86136
 * @Date: 2020/9/18 22:01
 * @Description:
 */
@Controller
@RequestMapping(value = "/demo",method = RequestMethod.GET)
public class HelloController {

    @RequestMapping("/demo001")
    @ResponseBody//这个一定不要漏
    public String hello(){
        return "Hello demo001!";
    }
}
