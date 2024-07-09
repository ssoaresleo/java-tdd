package com.java.aulas.example.javatdd.services;

import com.java.aulas.example.javatdd.modules.courses.entities.Course;
import com.java.aulas.example.javatdd.modules.courses.repositories.CourseInMemoryRepository;
import com.java.aulas.example.javatdd.modules.courses.services.CreateCourseService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreateCourseServiceTest {

    @Test
    public void should_be_able_to_create_a_new_course() {
        // Criar um novo curso
        // ID description name workload
        Course course = new Course();
        course.setDescription("Curso description test");
        course.setName("Course Name");
        course.setWorkLoad(100);

        // Criar Repositorio de curso

        CourseInMemoryRepository repository = new CourseInMemoryRepository();

        // Criar um novo service
            CreateCourseService createCourseService = new CreateCourseService(repository);
            Course createdCourse = createCourseService.create(course);


            assertNotNull(createdCourse.getId());
        // Criar table curso (Entidade)
    }

    @Test
    public void should_not_be_able_to_create_a_new_course_if_exists() {
        Course course = new Course();
        course.setDescription("Not Create Course");
        course.setName("Not Course");
        course.setWorkLoad(100);

        CourseInMemoryRepository repository = new CourseInMemoryRepository();

        // Criar um novo service
        CreateCourseService createCourseService = new CreateCourseService(repository);

        createCourseService.create(course);
        createCourseService.create(course);

    }

}
