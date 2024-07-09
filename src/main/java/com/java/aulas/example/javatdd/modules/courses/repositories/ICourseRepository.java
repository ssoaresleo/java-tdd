package com.java.aulas.example.javatdd.modules.courses.repositories;

import com.java.aulas.example.javatdd.modules.courses.entities.Course;

public interface ICourseRepository {
    public Course findByName(String name);
    public Course save(Course course);
}
