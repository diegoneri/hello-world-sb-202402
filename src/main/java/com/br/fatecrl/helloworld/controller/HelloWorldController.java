package com.br.fatecrl.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }
    @GetMapping("/ola")
    public String digaOla(){
        return "Olá, mundo!";
    }
}
