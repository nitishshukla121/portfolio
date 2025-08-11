package com.example.Spring.Thymeleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class Home {

   
    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/project")
    public String showProjectPage() {
        return "projects"; // Refers to projects.html
    }

    @GetMapping("/resume")
    public String showResumePage() {
        return "resume"; // Refers to resume.html
    }
    @GetMapping("/contact")
    public String showContactPage() {

        return "contact"; // Refers to contact.html
    }
   


}
