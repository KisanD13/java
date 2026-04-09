package com.restApiLearning.controller;

import com.restApiLearning.DTO.StudentDTO;
import com.restApiLearning.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;
//    private StudentController(StudentsRepository studentsRepository) {
//        this.studentsRepository = studentsRepository;
//    }

    @GetMapping("/students")
    public List<StudentDTO> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("student/{id}")
    public StudentDTO getStudentById(@PathVariable Long id) {
       return studentService.getStudentById(id);
    }
}
