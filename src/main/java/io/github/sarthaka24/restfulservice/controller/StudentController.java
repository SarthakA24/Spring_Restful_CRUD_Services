package io.github.sarthaka24.restfulservice.controller;

import io.github.sarthaka24.restfulservice.domain.Student;
import io.github.sarthaka24.restfulservice.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    private IStudentService<Student> studentService;

    @Autowired
    public StudentController(IStudentService<Student> studentService) {
        this.studentService = studentService;
    }
}
