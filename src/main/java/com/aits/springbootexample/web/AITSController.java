package com.aits.springbootexample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AITSController {

    @RequestMapping(value = "/application")
    public String about(){ return "application"; }

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
