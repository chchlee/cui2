package com.chosun.cui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InternshipController {

    @RequestMapping("/internship")
    public String internship(){
        return "internship";
    }
}
