package com.example.Spring.Thymeleaf.service;

import com.example.Spring.Thymeleaf.model.Profile;
import com.example.Spring.Thymeleaf.model.Project;
import com.example.Spring.Thymeleaf.model.TimelineEntry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioService {

	public Profile getProfile() {
        return new Profile(
"Nitish Shukla",
"Java Backend Developer",
"MCA candidate and Java web developer with hands-on experience building responsive web interfaces, multitier applications, and REST-based products. Strong foundation in HTML5, CSS3, Bootstrap, JavaScript, SQL, OOP, and design patterns.",
"Building scalable, high-performance applications with Java, Spring Boot, Microservices, and Databases.",
"nitish121shukla@gmail.com",
"+91 63866 32566",
"Noida, India",
"https://github.com/nitishshukla121",
"https://www.linkedin.com/in/nitish-shukla-ba208b271",
"/NITISH%20SHUKLA.pdf"
        );
    }

    public List<Project> getProjects() {
        return List.of(
            new Project(
                "Notify – Task Assignment & Notification System",
                "Multi-user web application with JWT-based authentication, role-based access control, and real-time in-app notifications. Designed REST APIs and database workflows using Spring Data JPA and MySQL, including composite indexes and custom queries for multi-criteria task filtering.",
                "Spring Boot, Spring Security, JWT, Spring Data JPA, MySQL, REST API",
                "https://github.com/nitishshukla121/Notify",
                "/assets/images/22.jpg"
            ),
            new Project(
                "High-Performance Image Compression Service",
                "Client-accessible REST API for image compression achieving 65–70% file size reduction while maintaining visual quality. Containerized and deployed on AWS EC2 with a zero-downtime CI/CD pipeline via GitHub Actions.",
                "Spring Boot, REST API, Docker, AWS EC2, GitHub Actions, CI/CD",
                "https://github.com/nitishshukla121/image-compression",
                "/assets/images/11.jpg"
            ),
            new Project(
                "SmartDoc – AI-Powered Document Intelligence Platform",
                "Web-based RAG document Q&A platform with PDF processing, semantic retrieval, and context-aware responses. Implemented concurrent PDF processing using Java ExecutorService integrated with a local Llama model.",
                "Spring Boot, Spring AI, Llama, Chroma, PostgreSQL",
                "https://github.com/nitishshukla121/smartdoc",
                "/assets/images/22.jpg"
            ),
            new Project(
                "Driving School Website",
                "A fully responsive and user-friendly website for a driving school. Features include detailed course information, seamless online registration, and interactive contact forms.",
                "HTML, CSS, Bootstrap, JavaScript, Java, JSP, MySQL",
                "https://github.com/nitishshukla121/Drivingmitra-",
                "/assets/images/11.jpg"
            )
        );
    }

    public List<TimelineEntry> getExperience() {
        return List.of(
            new TimelineEntry(
                "Jan 2025 – May 2025",
                "Spring Boot & Microservices Training",
                "Udemy Course",
                "Online",
                "Currently learning Spring Cloud, focusing on Netflix Eureka for service discovery and Feign Client for inter-service communication. Building scalable microservices and exploring centralized config and resilience patterns."
            ),
            new TimelineEntry(
                "Jan 2024 – May 2024",
                "Java Developer Intern",
                "Precursor Private Limited",
                "In-Office, Lucknow",
                "Engineered a 3-tier web application with a responsive frontend served through Java Servlets. Integrated frontend screens with server-side business logic and JDBC-based data operations, implementing CRUD workflows on MySQL and session-based authentication with the DAO design pattern."
            )
        );
    }

    public List<TimelineEntry> getEducation() {
        return List.of(
            new TimelineEntry(
                "2024 – 2026",
                "MCA",
                "Graphic Era University, Dehradun",
                "CGPA: 8.09",
                "Focusing on Java Backend Development and scalable applications. Gaining expertise in Spring Boot, Hibernate, REST APIs, Microservices, and cloud technologies."
            ),
            new TimelineEntry(
                "2021 – 2024",
                "BCA",
                "Babu Banarasi Das University, Lucknow",
                "Aggregate: 75%",
                "Completed a BCA degree with a strong foundation in Java, web development, and databases. Gained expertise in HTML, CSS, JavaScript, Java, Servlet, JSP, and MySQL."
            )
        );
    }

    public List<String> getSkills() {
        return List.of(
            "Java Backend Development", "Spring Boot & Hibernate", "REST API Development",
            "Security & Authentication", "Cloud Deployment (AWS, Oracle Cloud)", "Git, GitHub & CI/CD",
            "SQL / MySQL", "Docker", "JavaScript & Thymeleaf"
        );
    }
}