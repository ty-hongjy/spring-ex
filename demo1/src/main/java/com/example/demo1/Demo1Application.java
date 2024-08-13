/*
 * @Description: 
 * @Autor: name
 * @Date: 2024-07-23 11:05:24
 * @LastEditors: name
 * @LastEditTime: 2024-07-23 11:20:55
 */
package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.Springmvc;
//import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
        System.out.println("Hello World");
    }
}
