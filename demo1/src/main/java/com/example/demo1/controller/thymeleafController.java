package com.example.demo1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequestMapping("thyme")
public class thymeleafController {
    @GetMapping("hello")
//    @RequestMapping("hello")
//    @ResponseBody
    public String hello(Model model){
        String stranger ="jack";
        model.addAttribute("there",stranger);
        log.info("teacher");
        return "teacher";
//        return "welcome";
//        return "redirect:/teacher";
    }

//    @RequestMapping("teacher")
//    public String teacher(Model model){
//        String stranger ="jack";
//        model.addAttribute("there",stranger);
//        log.info("teacher");
//        return "teacher";
//    }

}
