package com.example.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;

@RestController
//@RequestMapping("/student")
public class StudentResource {
	private static final Logger log = LoggerFactory.getLogger(StudentResource.class);


    @RequestMapping("/studentDetails/{studentId}")
    public Student getStundetDetails(@PathVariable("studentId") String studentId) {
    	log.info("returning student details....");
        return new Student("Srikanth", "Hyd", "10");
    }

}