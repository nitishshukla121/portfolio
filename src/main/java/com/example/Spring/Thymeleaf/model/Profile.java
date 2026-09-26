package com.example.Spring.Thymeleaf.model;

public record Profile(
    String fullName,
    String title,
    String summary,
    String tagline,
    String email,
    String phone,
    String location,
    String githubUrl,
    String linkedinUrl,
    String resumeUrl
) {}