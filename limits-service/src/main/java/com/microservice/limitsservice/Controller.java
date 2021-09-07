package com.microservice.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    private Configuration configuration;

    @Autowired
    private Test test;

    @GetMapping
    public Limits getLimits(){
        System.out.println("test: " + test.getTest());
        return new Limits(configuration.getMin(),configuration.getMax());
    }


}
