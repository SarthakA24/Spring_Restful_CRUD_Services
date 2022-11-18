package io.github.sarthaka24.restfulservice.service;

import io.github.sarthaka24.restfulservice.domain.Student;

import java.util.List;

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
