package com.fastcampus.getinline.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;

@ControllerAdvice(basePackageClasses = BaseController.class)
@Controller
public class BaseController {

    @GetMapping("/")
    public String root() throws Exception {
        throw new Exception("테스트");
    }
}
