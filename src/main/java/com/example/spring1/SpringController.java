package com.example.spring1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringController {
    @GetMapping("/")
    @ResponseBody
    public String hello(){
        return "Hello world";
    }
}
