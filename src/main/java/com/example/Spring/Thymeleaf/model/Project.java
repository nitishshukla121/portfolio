package com.example.Spring.Thymeleaf.model;

public record Project(
    String title,
    String description,
    String techStack,
    String githubUrl,
    String imageUrl
) {}