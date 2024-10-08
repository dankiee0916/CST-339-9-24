package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/hello")
public class RestController {

    @GetMapping("/test1")
    @ResponseBody
    public String printHello() {
        return "Hello World! From a merged branch! :)";
    }
}