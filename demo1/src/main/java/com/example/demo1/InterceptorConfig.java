package com.example.demo1;

import com.example.demo1.controller.interceptor.UserInfoOnterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Bean
    public UserInfoOnterceptor userInfoOnterceptor(){
        return new UserInfoOnterceptor();
    }

    /**
     * register interceptor
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(userInfoOnterceptor())
                .addPathPatterns("/upload");

    }
}
