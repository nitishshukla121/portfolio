package com.example.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring.Entity.FormEntity;

@Repository
public interface ContactRepo extends JpaRepository<FormEntity, Long> {

}
