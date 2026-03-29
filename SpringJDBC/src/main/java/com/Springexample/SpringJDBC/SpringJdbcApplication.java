package com.Springexample.SpringJDBC;

import com.Springexample.SpringJDBC.model.Student;
import com.Springexample.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringJdbcApplication.class, args);

		Student student1 = context.getBean(Student.class);
		student1.setRollNo(104);
		student1.setName("Kishan");
		student1.setMarks(78);

		StudentService studentService = context.getBean(StudentService.class);
		studentService.addStudent(student1);

		Student student2 = context.getBean(Student.class);
		student2.setRollNo(105);
		student2.setName("Sagar");
		student2.setMarks(78);
		studentService.addStudent(student2);

		List<Student> students = studentService.getStudents();
		System.out.println(students);
	}

}
