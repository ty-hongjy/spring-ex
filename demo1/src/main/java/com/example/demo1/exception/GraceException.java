package com.example.demo1.exception;

public class GraceException {
    public static void display(String errMsg){
        throw new MyException(errMsg);
    }
}
