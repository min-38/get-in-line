package com.fastcampus.getinline.controllers;

import com.fastcampus.getinline.exception.GeneralException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

    @GetMapping("/")
    public String root() throws Exception {
        return "index";
    }
}
