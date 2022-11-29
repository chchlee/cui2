package com.chosun.cui.controller;

import com.chosun.cui.employment.Employment;
import com.chosun.cui.employment.EmploymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class EmploymentController {

    private final EmploymentService employmentService;

    @RequestMapping("/employment")
    public String employment(Model model, @RequestParam(value = "page", defaultValue = "0") int page){
        Page<Employment> paging = this.employmentService.getList(page);
        model.addAttribute("paging", paging);
        return "employment";
    }
}
