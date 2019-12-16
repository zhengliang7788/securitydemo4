package com.zhsw.securitydemo4.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;

/**
 * @Author: zhengliang
 * @Description: 拦截器
 * @Date: 2019/12/13 14:23
 */
@Configuration
public class RequestInterceptorConfig implements RequestInterceptor {

        @Override
        public void apply(RequestTemplate requestTemplate) {
            OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails)
                    SecurityContextHolder.getContext().getAuthentication().getDetails();
            requestTemplate.header("Authorization","bearer" + details.getTokenValue());
        }

}
