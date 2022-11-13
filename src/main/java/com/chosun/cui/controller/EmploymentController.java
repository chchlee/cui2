package com.chosun.cui.controller;

import com.chosun.cui.employment.Employment;
import com.chosun.cui.employment.EmploymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class EmploymentController {

    private final EmploymentService employmentService;

    @RequestMapping("/employment")
    public String employment(Model model){
        List<Employment> employmentList = this.employmentService.getList();
        model.addAttribute("employmentList", employmentList);
        return "employment";
    }
}
