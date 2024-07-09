package com.java.aulas.example.javatdd.modules.courses.controllers;

import com.java.aulas.example.javatdd.modules.courses.entities.Course;
import com.java.aulas.example.javatdd.modules.courses.repositories.CourseRepository;
import com.java.aulas.example.javatdd.modules.courses.services.CreateCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseRepository repository;

    @PostMapping
    public Course createCourse(@RequestBody Course courseData) {
        CreateCourseService createCourseService = new CreateCourseService(repository);
        return createCourseService.create(courseData);
    }
}
