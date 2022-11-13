package com.chosun.cui.controller;

import com.chosun.cui.internship.Internship;
import com.chosun.cui.internship.InternshipService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class InternshipController {

    private final InternshipService internshipService;

    @RequestMapping("/internship")
    public String internship(Model model){
        List<Internship> internshipList = this.internshipService.getList();
        model.addAttribute("internshipList", internshipList);
        return "internship";
    }
}
