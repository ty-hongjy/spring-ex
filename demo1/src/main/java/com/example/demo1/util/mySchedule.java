package com.example.demo1.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
//@EnableScheduling
@Slf4j
public class mySchedule {
    @Scheduled(cron = "*/5 * * * * *")
    public void publishMsg(){
        log.info("start schedule task: {}", LocalDateTime.now());
    }
}
