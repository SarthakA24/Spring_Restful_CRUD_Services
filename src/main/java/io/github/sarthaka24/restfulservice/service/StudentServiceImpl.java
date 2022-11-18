package io.github.sarthaka24.restfulservice.service;

import io.github.sarthaka24.restfulservice.domain.Student;
import io.github.sarthaka24.restfulservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService<Student> {
    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public boolean saveData(Student student) {
        return false;
    }

    @Override
    public boolean deleteData(int id) {
        return false;
    }

    @Override
    public boolean updateData(Student student) {
        return false;
    }

    @Override
    public List<Student> getData() {
        return null;
    }
}
