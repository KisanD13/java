package com.restApiLearning.service.impl;

import com.restApiLearning.DTO.AddStudentDTO;
import com.restApiLearning.DTO.StudentDTO;
import com.restApiLearning.entity.Student;
import com.restApiLearning.repository.StudentsRepository;
import com.restApiLearning.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        Student student = studentsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student with id " + id + " not found"));
        StudentDTO studentDTO = modelMapper.map(student, StudentDTO.class);
        return studentDTO;
    }

    @Override
    public StudentDTO createNewStudent(AddStudentDTO addStudentDTO) {
        Student newStudent = modelMapper.map(addStudentDTO, Student.class);
        Student student = studentsRepository.save(newStudent);
        return modelMapper.map(student, StudentDTO.class);
    }

    @Override
    public void deleteStudentById(Long id) {
        if (!studentsRepository.existsById(id)) {
            throw new IllegalArgumentException("Student with id " + id + " not found");
        }
        studentsRepository.deleteById(id);
    }

    @Override
    public StudentDTO updateStudentByID(Long id, AddStudentDTO addStudentDTO) {
        Student student = studentsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student with id " + id + " not found"));
        modelMapper.map(addStudentDTO, student);
        student = studentsRepository.save(student);
        return modelMapper.map(student, StudentDTO.class);
    }

    @Override
    public StudentDTO updatePartialStudent(Long id, Map<String, Object> patch) {
        Student student = studentsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student with id " + id + " not found"));
        patch.forEach((key, value) -> {
            switch (key) {
                case "name":
                    student.setName((String) value);
                    break;
                case "email":
                    student.setEmail((String) value);
                    break;
                default:
                    throw new IllegalArgumentException("Student with id " + id + " not found");
                    
            }
        });
        Student saveStudent = studentsRepository.save(student);
        return modelMapper.map(student, StudentDTO.class);
    }
}
