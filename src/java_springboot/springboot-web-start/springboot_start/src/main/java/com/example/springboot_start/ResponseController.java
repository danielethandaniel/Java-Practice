package com.example.springboot_start;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {
    @RequestMapping("/response")
        public void response(HttpServletResponse response){
//            设置状态码
        response.setStatus(HttpServletResponse.SC_OK);
//            设置响应头
        response.setHeader("name","zhangsan");
        response.setHeader("age","18");
        response.setHeader("sex","man");
        response.setHeader("hobby","football");
        response.setHeader("country","China");
        response.setHeader("city","Shanghai");
        response.setHeader("street","Pudong");
        response.setHeader("houseNumber","1");
        response.setHeader("phoneNumber","12345678901");
        response.setHeader("email","<EMAIL>");
        response.setHeader("birthday","1999-01-01");
        response.setHeader("introduction","I am a student.");
        response.setHeader("avatar","https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png");
        response.setHeader("createTime","2021-01-01 00:00:00");
        response.setHeader("updateTime","2021-01-01 00:00:00");
        response.setHeader("deleteFlag","0");
        response.setHeader("version","1");

//        设置响应体
        response.setContentType("text/html;charset=utf-8");
        }

}
