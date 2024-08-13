/*
 * @Description: 
 * @Autor: name
 * @Date: 2024-08-09 14:30:29
 * @LastEditors: name
 * @LastEditTime: 2024-08-09 14:57:47
 */
package com.example.demo1;

import com.example.demo1.pojo.Stu;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements  WebMvcConfigurer{
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/templates/**").setViewName("thyme/teacher");
//        registry.addViewController("/").setViewName("/templates/teacher");
//        registry.addViewController("/").setViewName("/teacher");
//    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
//        registry.addResourceHandler("/**").addResourceLocations("classpath:/templates/");
//}

}


//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
//    }

