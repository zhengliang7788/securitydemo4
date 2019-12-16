package com.zhsw.securitydemo4.controller;

import com.zhsw.securitydemo4.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: zhengliang
 * @Description: testHello
 * @Date: 2019/12/12 14:51
 */
@RestController
public class HelloController {
    // 1. 可以get访问
    // http://localhost:8080/oauth/authorize?client_id=clientId&response_type=code&redirect_uri=http://localhost:8080/


    // 2. 必须post访问
    // http://localhost:8080/oauth/token?grant_type=authorization_code&code=授权码&redirect_uri=http://localhost:8080/&client_id=clientId&client_secret=secret
    @Autowired
    private HelloService helloService;
    /**
     * 受保护的资源
     */
    @GetMapping("/user/save")
    public String save() {
        return "save";
    }




    /** 受保护的资源 */
    @GetMapping("/user/gets")
    public String gets(){
        return helloService.get();
    }
}