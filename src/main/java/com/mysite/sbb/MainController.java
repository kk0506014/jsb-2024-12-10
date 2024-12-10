package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    // GET http://localhost:8080/
    @GetMapping("/")
    @ResponseBody
    public String home() {
        System.out.println("안녕하세요.");
        return "안녕하세요.";
    }

    // GET http://localhost:8080/about
    @GetMapping("/about")
    public void about() {
        System.out.println("about");
    }
}