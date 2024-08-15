package com.example.demo1.exception;

/**
 * 自定义异常信息
 * 便于解耦，可以在拦截器，控制层，业务层去使用
 */
public class MyException extends RuntimeException{

    public MyException(String message) {
        super(message);
    }
}
