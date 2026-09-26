package com.example.Spring.Thymeleaf.Controller;

import com.example.Spring.Thymeleaf.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

    @Autowired
    private PortfolioService portfolioService;

    @GetMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("profile", portfolioService.getProfile());
        model.addAttribute("projects", portfolioService.getProjects());
        model.addAttribute("experience", portfolioService.getExperience());
        model.addAttribute("education", portfolioService.getEducation());
        model.addAttribute("skills", portfolioService.getSkills());
        return "index";
    }
}