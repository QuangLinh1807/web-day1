package com.example.webday1.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webday1.model.Student;

@RestController
@RequestMapping("/object")
public class ObjectController {

	@GetMapping("/student")
	public Student stu() {
		Student s = new Student("Huy", 27, 5.5);
		return s;
	}

	@GetMapping("/list-student")
	public Collection<Student> listStu() {
		Student s1 = new Student("Huy", 27, 5.5);
		Student s2 = new Student("Quang", 28, 6.5);
		Student s3 = new Student("Tran", 29, 4.5);
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		return list;
	}
}
