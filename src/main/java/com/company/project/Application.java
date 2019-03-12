package com.company.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/hi")
    public String hi(){
        return "hi.By Get....";
    }

    @PostMapping("/helloPost")
    public String helloPost(){
        return "helloPost.By Post.";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

