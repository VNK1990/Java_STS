package com.udemy.springboot.learnspringboot.simpleapi;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@GetMapping("/courses")
	public List<Course> retriveAllCourses() {
		return Arrays.asList(new Course(1, "AWS", "Udemy"), new Course(2, "DEVOPS", "Udemy"), new Course(3, "Cloud", "Udemy"));
	}

}
