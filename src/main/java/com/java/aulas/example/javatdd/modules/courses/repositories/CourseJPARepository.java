package com.java.aulas.example.javatdd.modules.courses.repositories;

import com.java.aulas.example.javatdd.modules.courses.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseJPARepository extends JpaRepository<Course, UUID> {
    Course findByName(String name);
}
