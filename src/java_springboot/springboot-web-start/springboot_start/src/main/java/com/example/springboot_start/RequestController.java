package com.example.springboot_start;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @RequestMapping("/request")
    public String request(HttpServletRequest request) {
//        1.获取请求方式
        String method = request.getMethod();
        System.out.println("method:" + method);
//        2.获取请求url
        String url = request.getRequestURL().toString();
        System.out.println("url:" + url);
//        3.获取请求协议
            String protocol = request.getProtocol();
            System.out.println("protocol:" + protocol);
        return method;
    }
}
