package com.fastcampus.getinline.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController implements ErrorController {

    @GetMapping("/")
    public String root() {
        return "index";
    }
}
