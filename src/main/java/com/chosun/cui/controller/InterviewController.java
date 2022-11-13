package com.chosun.cui.controller;

import com.chosun.cui.interview.Interview;
import com.chosun.cui.interview.InterviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class InterviewController {

    private final InterviewService interviewService;

    @RequestMapping("/interview")
    public String interview(Model model){
        List<Interview> interviewList = this.interviewService.getList();
        model.addAttribute("interviewList", interviewList);
        return "interview";
    }
}
