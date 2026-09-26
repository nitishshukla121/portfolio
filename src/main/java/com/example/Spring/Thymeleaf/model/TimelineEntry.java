package com.example.Spring.Thymeleaf.model;

public record TimelineEntry(
    String dateRange,
    String title,
    String subtitle,
    String location,
    String description
) {}