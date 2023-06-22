package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${davids.favoritenumber}")
    private int favoriteNumber;
    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!!!!! My Favorite Number is " + Integer.toString(favoriteNumber);
    }
    @GetMapping("/TestReload")
    public String TestReload()
    {
        return "Reload Double Successful.";
    }
}
