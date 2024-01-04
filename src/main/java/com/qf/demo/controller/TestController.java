package com.qf.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lj
 * @version 1.0
 */

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
