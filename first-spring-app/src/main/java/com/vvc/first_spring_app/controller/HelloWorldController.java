package com.vvc.first_spring_app.controller;

import com.vvc.first_spring_app.domain.User;
import com.vvc.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    //O @Autowired injeta automaticamente uma instância da classe HelloWorldService na variável helloWorldService, permitindo que o Spring gerencie sua criação e ciclo de vida
    @Autowired
    private HelloWorldService helloWorldService;

    //    @Autowired
    //    private SDKAWS sdkAWS;

    @GetMapping
    public String helloWorld() {
        return helloWorldService.HelloWorld("Valle");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value ="filter", defaultValue = "none") String filter, @RequestBody User body) {
        // @PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "none") String filter,  @RequestBody User body
        return "Hello, " + body.getName() + " Seu id é" + id + " Seu email é" + body.getEmail() + filter;
    }

}
