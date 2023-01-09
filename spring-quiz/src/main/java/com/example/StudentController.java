package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping(value = "/student1")
	public StudentDao student1() {
		StudentDao studentDao = new StudentDao();
		studentDao.setName("yuna");
		studentDao.setAge(20);
		studentDao.setJavaGrade("A+");
		studentDao.setOracleGrade("C");
		
		System.out.println("객체 정보:" + studentDao.toString());
		
		return studentDao;
	}
	
	@GetMapping(value = "/student2")
	public StudentDao student2() {
		StudentDao studentDao = new StudentDao();
		studentDao.setName("jimin");
		studentDao.setAge(21);
		studentDao.setJavaGrade("B+");
		studentDao.setOracleGrade("F");
		System.out.println("객체 정보:" + studentDao.toString());
		
		return studentDao;
	}
}
