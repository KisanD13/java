package com.restApiLearning.controller;

import com.restApiLearning.DTO.StudentDTO;
import com.restApiLearning.entity.Student;
import com.restApiLearning.repository.StudentsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentsRepository studentsRepository;

    private StudentController(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    @GetMapping("/student")
    public List<Student> getStudent() {
        return studentsRepository.findAll();
    }
}
