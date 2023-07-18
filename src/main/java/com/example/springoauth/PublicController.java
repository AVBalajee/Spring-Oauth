package com.example.springoauth;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {

    @GetMapping("/")
    public String home() {
        return "Hey, Public User Welcome!";
    }

    @GetMapping("/secured")
    public String secured() {
        return "Hushhh , Hi Private User!";
    }

}
