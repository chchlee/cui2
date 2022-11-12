package com.chosun.cui.controller;

import com.chosun.cui.bootcamp.Bootcamp;
import com.chosun.cui.bootcamp.BootcampRepository;
import com.chosun.cui.bootcamp.BootcampService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class BootcampController {

    private final BootcampService bootcampService;

    @RequestMapping("/bootcamp")
    public String bootcamp(Model model){
        List<Bootcamp> bootcampList = this.bootcampService.getList();
        model.addAttribute("bootcampList", bootcampList);
        return "bootcamp";
    }
}
