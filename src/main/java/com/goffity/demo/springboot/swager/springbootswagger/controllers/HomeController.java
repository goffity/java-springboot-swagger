package com.goffity.demo.springboot.swager.springbootswagger.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class HomeController {
    private final Log logging = LogFactory.getLog(HomeController.class.getSimpleName());

    @GetMapping(value = "/home")
    public @ResponseBody String getHome(){
        return "home";
    }
}
