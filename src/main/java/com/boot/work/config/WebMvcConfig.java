package com.boot.work.config;

import com.boot.work.Interceptor.AdminInterceptor;
import com.boot.work.Interceptor.UserInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        // 관리자만 접근 가능
        registry.addInterceptor(new AdminInterceptor())
                .addPathPatterns("/admin/*");

        //사용자 접근
        registry.addInterceptor(new UserInterceptor())
                .addPathPatterns("/user/*")
                .excludePathPatterns("/user/login");


    }
}
