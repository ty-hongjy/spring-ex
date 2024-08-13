package com.example.demo1.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
@Slf4j
public class myayncTask {
    public void publishmsb(){
//        try{
        log.info("Asyn task start");
    }
}
