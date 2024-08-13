/*
 * @Description: 
 * @Autor: name
 * @Date: 2024-07-23 10:44:15
 * @LastEditors: name
 * @LastEditTime: 2024-07-23 11:22:24
 */
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hello");
	}

}
