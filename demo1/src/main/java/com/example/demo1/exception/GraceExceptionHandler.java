package com.example.demo1.exception;
/*
 * @Description:
 * @Autor: name
 * @Date: 2024-08-14 09:59:27
 * @LastEditors: name
 * @LastEditTime: 2024-08-14 13:57:19
 */

import com.example.demo1.util.JSONResult;
import org.apache.tomcat.util.http.fileupload.impl.FileSizeLimitExceededException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *统一异常拦截处理
 *可以针对异常自定义去处理去捕获，返回指定的类型(json类型) 到前端
 */

@ControllerAdvice
public class GraceExceptionHandler {
//    @ExceptionHandler(FileSizeLimitExceededException.class)
//    @ResponseBody
//    public JSONResult returnMaxFileSizeLimit(FileSizeLimitExceededException e) {
//        return JSONResult.errorMsg("文件大小不能超过500KB");
//        return JSONResult();
//    }

    @ExceptionHandler(FileSizeLimitExceededException.class)
    @ResponseBody
    public JSONResult returnMaxFileSizeLimit(MyException e) {
        return JSONResult.errorMsg(e.getMessage());
    }

}
