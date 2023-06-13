package com.twiiter.apptwiiterclone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
    @GetMapping("getHello")
    public String getHello() {
        return "Hello from Fotih";
    }
}
