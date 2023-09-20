package ca.sheridancollege.sin14089.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping("index.html")
    public String gohome(){
        return "Hello World Created By Sukhmanmeet Singh";
    }
@PostMapping("index.html")
public String gohome2(){
        return "Hello World Created By Sukhmanmeet Singh";
    }
}
