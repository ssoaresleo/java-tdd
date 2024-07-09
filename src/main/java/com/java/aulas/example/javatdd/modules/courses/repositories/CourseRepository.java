package com.java.aulas.example.javatdd.modules.courses.repositories;

import com.java.aulas.example.javatdd.modules.courses.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseRepository implements ICourseRepository {
    @Autowired
    private CourseJPARepository repository;

    @Override
    public Course findByName(String name) {
       return this.repository.findByName(name);
    }

    @Override
    public Course save(Course course) {
        return this.repository.save(course);
    }
}
