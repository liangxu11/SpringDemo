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





}
