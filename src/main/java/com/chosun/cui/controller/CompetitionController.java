package com.chosun.cui.controller;

import com.chosun.cui.competition.Competition;
import com.chosun.cui.competition.CompetitionService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class CompetitionController {

    private final CompetitionService competitionService;

    @RequestMapping("/competition")
    public String competition(Model model, @RequestParam(value = "page", defaultValue = "0") int page){
        Page<Competition> paging = this.competitionService.getList(page);
        model.addAttribute("paging",paging);
        return "competition";
    }
}
