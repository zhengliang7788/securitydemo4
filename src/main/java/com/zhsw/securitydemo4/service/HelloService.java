package com.zhsw.securitydemo4.service;

import com.zhsw.securitydemo4.config.RequestInterceptorConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: zhengliang
 * @Description: 调用方
 * @Date: 2019/12/13 14:25
 */
@FeignClient(value = "securityDemo3",configuration = RequestInterceptorConfig.class)
public interface HelloService {
    @GetMapping("/oauth/user/get")
    String get();

}
