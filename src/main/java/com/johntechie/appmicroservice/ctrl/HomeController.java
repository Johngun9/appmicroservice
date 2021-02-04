package com.johntechie.appmicroservice.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String getGreeting(){
        return "Hi Welcome to Home controller";
    }

    @GetMapping("/{name}")
    public String getGreetingWithName(@PathVariable String name){
        return "Hi "+name+" Welcome to Microservice Architecture Application !!!";
    }
}
