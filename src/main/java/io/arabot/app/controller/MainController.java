package io.arabot.app.controller;

import io.arabot.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class MainController {

    @Autowired
    StudentService studentService ;

    @GetMapping("/")
    public Map<String , String> homePage(){
        Map<String,String> response = new HashMap<>();
        response.put("message","Main Page Works!!!");
        return response;
    }
}
