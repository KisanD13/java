package com.restApiLearning.service.impl;

import com.restApiLearning.DTO.StudentDTO;
import com.restApiLearning.entity.Student;
import com.restApiLearning.repository.StudentsRepository;
import com.restApiLearning.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentsRepository studentsRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDTO> getAllStudents() {
        List<Student> students = studentsRepository.findAll();
        List<StudentDTO> studentDTOS = students
                .stream()
                .map(student -> new StudentDTO(student.getId(), student.getName(), student.getEmail()))
                .toList();
        return studentDTOS;
    }

    @Override
    public StudentDTO getStudentById(Long id) {
        Student student = studentsRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Student with id " + id + " not found"));
        StudentDTO studentDTO = modelMapper.map(student, StudentDTO.class);
        return studentDTO;
    }
}
