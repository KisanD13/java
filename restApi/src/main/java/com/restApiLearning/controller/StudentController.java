package com.restApiLearning.controller;

import com.restApiLearning.DTO.AddStudentDTO;
import com.restApiLearning.DTO.StudentDTO;
import com.restApiLearning.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;
//    private StudentController(StudentsRepository studentsRepository) {
//        this.studentsRepository = studentsRepository;
//    }

    @GetMapping
    public ResponseEntity<List<StudentDTO>> getAllStudents() {
        return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> getStudentById(@PathVariable Long id) {
//       return  ResponseEntity.status(HttpStatus.OK).body(studentService.getStudentById(id));
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @PostMapping
    public ResponseEntity<StudentDTO> saveStudent(@RequestBody @Valid AddStudentDTO addStudentDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudentById(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentDTO> updateStudentById(@PathVariable Long id, @RequestBody AddStudentDTO addStudentDTO) {
        return ResponseEntity.ok(studentService.updateStudentByID(id, addStudentDTO));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<StudentDTO> patchStudentById(@PathVariable Long id, @RequestBody Map<String, Object> patch) {
        System.out.println("patch " + patch);
        return ResponseEntity.ok(studentService.updatePartialStudent(id, patch));
    }

}
