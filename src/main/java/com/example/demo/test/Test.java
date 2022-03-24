package com.example.demo.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping("/test")
    public  Integer test1(){
        System.out.println("111111");
        int a=1;
        return a;
    }}
