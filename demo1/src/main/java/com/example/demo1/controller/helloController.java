/*
 * @Description: 
 * @Autor: name
 * @Date: 2024-07-30 16:14:27
 * @LastEditors: name
 * @LastEditTime: 2024-07-30 16:30:55
 */

package com.example.demo1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class helloController {
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        log.info("log hello");
        return "hello world~~";

    }
}
