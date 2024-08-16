/*
 * @Description: 
 * @Autor: name
 * @Date: 2024-07-30 16:14:27
 * @LastEditors: name
 * @LastEditTime: 2024-07-30 16:30:55
 */

package com.example.demo1.controller;

import com.example.demo1.pojo.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
public class hello1Controller {
    @RequestMapping("hello1")
    public String hello(){
        System.out.println("hello world 1~~");
        return "hello world 1~~";
    }

    @RequestMapping("hello2")
    public String hello2(){
        System.out.println("hello world 2~~");
        return "hello world 2~~";
    }

    @Autowired
    private Stu stu;

    @GetMapping("getStu")
    public Stu getStu(){
        return  stu;
    };

    @PostMapping("upload")
    public String upload(MultipartFile file) throws  Exception{
        file.transferTo(new File("d://temp//"+file.getOriginalFilename()));
        return "upload success";
    }
}
