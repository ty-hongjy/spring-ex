package com.example.demo1.controller;

import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("stu")
@Slf4j
public class stuController {
    @GetMapping("{stuId}/get")
    public String getStu(@PathVariable("StuId") String stuId,
                         @RequestParam Integer id,
                         @RequestParam String name){
//        System.out.println("hello world 1~~");
        log.info("get stuId={}", stuId);
        log.info("id={}", id);
        log.info("name={}", name);
        return "get stu";
    }

    @PostMapping("create")
    public String createStu(@RequestBody Map<String,Object> map,
                            @RequestHeader("token") String token,
                            @CookieValue("clientId") String ClientId,
                            HttpServletRequest request){

        log.info("token ={}", token);
        log.info("clientId={}", ClientId);
        log.info("map={}", map.toString());

        String headtoken= request.getHeader( "token");
        log.info("htoken ={}", headtoken);
        return "create stu";
    }

    @RequestMapping("hello2")
    public String hello2(){
        System.out.println("hello world 2~~");
        return "hello world 2~~";
    }

}
