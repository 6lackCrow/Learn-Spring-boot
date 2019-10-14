package com.spbdemo.xxdemo.controller;

import com.spbdemo.xxdemo.server.TestServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    TestServer testServer;
    @RequestMapping("/hello")
    String hello(){
        return "hello" + testServer.add(3 , 4);
    }
}
