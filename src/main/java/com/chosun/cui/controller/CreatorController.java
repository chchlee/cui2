package com.chosun.cui.controller;

import com.chosun.cui.creator.Creator;
import com.chosun.cui.creator.CreatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class CreatorController {

    private final CreatorService creatorService;

    @RequestMapping("/creator")
    public String creator(Model model){
        List<Creator> creatorList = this.creatorService.getList();
        model.addAttribute("creatorList",creatorList);
        return "creator";
    }
}