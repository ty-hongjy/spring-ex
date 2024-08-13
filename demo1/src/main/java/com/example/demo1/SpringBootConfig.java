/*
 * @Description: 
 * @Autor: name
 * @Date: 2024-08-09 14:30:29
 * @LastEditors: name
 * @LastEditTime: 2024-08-09 14:57:47
 */
package com.example.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.demo1.pojo.Stu;


@Configuration
/**
 *
 */
public class SpringBootConfig {

    @Bean
    public Stu stu() {
        return new Stu("Jack", 18);
    }
}


