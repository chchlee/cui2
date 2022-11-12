package com.chosun.cui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmploymentController {

    @RequestMapping("/employment")
    public String employment(){
        return "employment";
    }
}
