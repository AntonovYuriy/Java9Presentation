package com.example.reflection.problem.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller("/hello")
public class ReflectionProblemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReflectionProblemApplication.class, args);
    }

    @GetMapping
    public String test() {
        return "Hello";
    }

}

