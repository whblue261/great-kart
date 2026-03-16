package com.greatlearning.great_kart.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller + @ResponseBody
public class HomeController {

    @GetMapping("/home")
    public @ResponseBody
    String welcome(){
        return "Hi, Welcome to the video!";
    }
}
