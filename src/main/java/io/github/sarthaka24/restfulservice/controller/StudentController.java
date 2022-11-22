package io.github.sarthaka24.restfulservice.controller;

import io.github.sarthaka24.restfulservice.domain.Student;
import io.github.sarthaka24.restfulservice.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    private final IStudentService studentService;

    @Autowired
    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/add-student")
    public ResponseEntity<?> saveStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.saveData(student), HttpStatus.CREATED);
    }

    @GetMapping("/get-all")
    public ResponseEntity<?> fetchAllStudent() {
        return new ResponseEntity<>(studentService.getData(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> fetchById(@PathVariable int id) {
        return new ResponseEntity<>(studentService.getDataById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete-student/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable int id) {
        studentService.deleteData(id);
        return new ResponseEntity<>("Student Deleted Successfully!", HttpStatus.OK);
    }

    @GetMapping("/get/{name}")
    public ResponseEntity<?> fetchStudentByName(@PathVariable String name) {
        return new ResponseEntity<>(studentService.getByName(name), HttpStatus.OK);
    }
}
