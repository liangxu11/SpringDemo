package com.example.demo.test.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShipmentController {

    @RequestMapping("/split")
    public String toString() {
        System.out.println("111");
        return null;
    }

    @RequestMapping("/split12")
    public String toString1() {
        System.out.println("1112");
        return null;
    }


    @RequestMapping("/split13")
    public String toString3() {
        System.out.println("1113");
        return null;
    }


    @RequestMapping("/split55")
    public String toString5() {
        System.out.println("15553");
        return null;
    }



}
