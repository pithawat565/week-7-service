package com.example.chapter6.testservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private Environment env;

    @GetMapping(value = "/test")
    public String getPort(){
        return "port is : "+env.getProperty("local.server.port");
    }
}
