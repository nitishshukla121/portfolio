package com.example.Spring.Thymeleaf.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.Spring.Entity.FormEntity;
import com.example.Spring.Thymeleaf.Service.ContactService;

@Controller
public class Home {

    @Autowired
    private ContactService contactService;

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
    public String showContactPage(Model model) {
        model.addAttribute("contact", new FormEntity());

        return "contact"; // Refers to contact.html
    }
    @PostMapping("/submit-contact")
    public String submitContactForm(@ModelAttribute FormEntity contactForm, RedirectAttributes redirectAttributes) {
        // Save the contact form (Assume contactService.saveContact(contactForm) works)
        contactService.saveContact(contactForm);

        // Add success message to be shown after redirect
        redirectAttributes.addFlashAttribute("message", "Your message has been sent successfully!");

        // Redirect to /contact page (so success message is shown there)
        return "redirect:/contact";
    }


}
