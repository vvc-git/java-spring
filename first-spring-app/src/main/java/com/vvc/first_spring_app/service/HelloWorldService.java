package com.vvc.first_spring_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String HelloWorld(String name) {
        return "Hello World " + name;
    }
}
