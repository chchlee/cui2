package com.chosun.cui.controller;

import com.chosun.cui.interview.Interview;
import com.chosun.cui.interview.InterviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/interview")

@RequiredArgsConstructor
@Controller
public class InterviewController {

    private final InterviewService interviewService;

    @RequestMapping("/list")
    public String interview(Model model){
        List<Interview> interviewList = this.interviewService.getList();
        model.addAttribute("interviewList", interviewList);
        return "interview_list";
    }

    @RequestMapping(value = "/detail/{IVNumber}")
    public String detail(Model model, @PathVariable("IVNumber") Integer IVNumber){
        Interview interview = this.interviewService.getInterview(IVNumber);
        model.addAttribute("interview",interview);
        return "interview_detail";
    }
}
