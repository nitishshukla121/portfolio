package com.example.Spring.Thymeleaf.Service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.Spring.Repository.*;
import org.springframework.stereotype.Service;

import com.example.Spring.Entity.FormEntity;

@Service
public class ContactService {

    @Autowired
    private ContactRepo contactRepository;

    public void saveContact(FormEntity contactForm) {
        contactRepository.save(contactForm);
    }
}
