package com.restApiLearning.service;

import com.restApiLearning.DTO.AddStudentDTO;
import com.restApiLearning.DTO.StudentDTO;

import java.util.List;
import java.util.Map;

public interface StudentService {
    List<StudentDTO> getAllStudents();

    StudentDTO getStudentById(Long id);

    StudentDTO createNewStudent(AddStudentDTO addStudentDTO);

    void deleteStudentById(Long id);

    StudentDTO updateStudentByID(Long id, AddStudentDTO addStudentDTO);

    StudentDTO updatePartialStudent(Long id, Map<String, Object> patch);
}
