package com.barbaros.crudnotas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello world";
    }
}
