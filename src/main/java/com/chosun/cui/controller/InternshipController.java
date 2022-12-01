package com.chosun.cui.controller;

import com.chosun.cui.internship.Internship;
import com.chosun.cui.internship.InternshipService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class InternshipController {

    private final InternshipService internshipService;

    @RequestMapping("/internship")
    public String internship(Model model, @RequestParam(value = "page", defaultValue = "0") int page){
        Page<Internship> paging = this.internshipService.getList(page);
        model.addAttribute("paging", paging);
        return "internship";
    }
}
