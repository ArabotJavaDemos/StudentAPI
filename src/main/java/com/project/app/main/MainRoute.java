package com.project.app.main;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRoute {

@GetMapping("/")
    public String homePage(){
    return "Test";
}
}
