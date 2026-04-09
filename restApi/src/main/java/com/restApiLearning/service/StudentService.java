package com.restApiLearning.service;

import com.restApiLearning.DTO.StudentDTO;

import java.util.List;

public interface StudentService {
    List<StudentDTO> getAllStudents();
    StudentDTO getStudentById(Long id);
}
