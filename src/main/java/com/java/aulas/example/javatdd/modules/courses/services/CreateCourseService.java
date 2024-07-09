package com.java.aulas.example.javatdd.modules.courses.services;

import com.java.aulas.example.javatdd.modules.courses.entities.Course;
import com.java.aulas.example.javatdd.modules.courses.repositories.ICourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateCourseService {

    private ICourseRepository repository;

    public CreateCourseService(ICourseRepository repository) {
        this.repository = repository;
    }

    public Course create(Course courseData) {
        // Validar se o curso já é existente
        Course courseAlreadyExists = this.repository.findByName(courseData.getName());

        // Caso seja retorna erro
        if(courseAlreadyExists != null) {
            throw new Error("Curso já existe!");
        }

        // Se não cria e retorna um novo curso
        return this.repository.save(courseData);
    }
}
