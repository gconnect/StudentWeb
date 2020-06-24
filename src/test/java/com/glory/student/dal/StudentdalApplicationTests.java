package com.glory.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.glory.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	void testCreateSudent() {
		Student student = new Student();
		student.setName("Glory");
		student.setCourse("English");
		student.setFee(500d);
		studentRepository.save(student);
	}

	@Test
	void testReadOneStudent() {
		studentRepository.findById(1l);
//		System.out.println(student);
	}
	
//	@Test
//	void testUpdateStudent() {
//		
//		Student student = studentRepository.findById(1l);
//		studentRepository.save(student);
//	}
	
	@Test
	void testDeleteStudent() {
		Student student = new Student();
		student.setId(1l);
		studentRepository.delete(student);
	}
}
