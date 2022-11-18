package io.github.sarthaka24.restfulservice.service;

import io.github.sarthaka24.restfulservice.domain.Student;
import io.github.sarthaka24.restfulservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService<Student> {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveData(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteData(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getData() {
        return (List<Student>) studentRepository.findAll();
    }
}
