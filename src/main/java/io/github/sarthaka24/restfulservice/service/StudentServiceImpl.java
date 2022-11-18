package io.github.sarthaka24.restfulservice.service;

import io.github.sarthaka24.restfulservice.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService<Student> {
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
