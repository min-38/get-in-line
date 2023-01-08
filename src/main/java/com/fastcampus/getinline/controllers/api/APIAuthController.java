package com.fastcampus.getinline.controllers.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class APIAuthController {

    @GetMapping("/login")
    public String signUp() {
        return "done.";
    }

    @GetMapping("/sign-up")
    public String login() {
        return "done.";
    }
}
