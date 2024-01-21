package com.example.parctica1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(AppController.ANIME)
public class AppController {
    public static final String ANIME = "/anime";
    @Autowired
    AppService service;
    @GetMapping
    public String getRoot(Model model){
        Root a = service.getRoot1();
        Root b = service.getRoot2();
        Root c = service.getRoot3();
        model.addAttribute("url1",a.url());
        model.addAttribute("url2",b.url());
        model.addAttribute("url3",c.url());
        model.addAttribute("text1",service.random[service.r1]);
        model.addAttribute("text2",service.random[service.r2]);
        model.addAttribute("text3",service.random[service.r3]);
        return "anime";
    }
}
