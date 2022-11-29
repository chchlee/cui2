package com.chosun.cui.controller;

import com.chosun.cui.bootcamp.Bootcamp;
import com.chosun.cui.bootcamp.BootcampRepository;
import com.chosun.cui.bootcamp.BootcampService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class BootcampController {

    private final BootcampService bootcampService;

    @RequestMapping("/bootcamp")
    public String bootcamp(Model model, @RequestParam(value = "page", defaultValue = "0") int page){
        Page<Bootcamp> paging = this.bootcampService.getList(page);
        model.addAttribute("paging", paging);
        return "bootcamp";
    }
}