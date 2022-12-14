package com.chosun.cui.controller;

import com.chosun.cui.competition.Competition;
import com.chosun.cui.competition.CompetitionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class CompetitionController {

    private final CompetitionService competitionService;

    @RequestMapping("/competition")
    public String list(Model model){

        List<Competition> competitionList = this.competitionService.getList();
        model.addAttribute("competitionList",competitionList);
        return "competition";
    }
}
