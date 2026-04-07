package com.restApiLearning.controller;

import com.restApiLearning.DTO.StudentDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDTO getStudent() {
        return new StudentDTO(12L, "Sagar", "abc@gmail.com");
    }
}
