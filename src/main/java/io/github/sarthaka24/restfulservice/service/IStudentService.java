package io.github.sarthaka24.restfulservice.service;

import io.github.sarthaka24.restfulservice.domain.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    Student saveData(Student student);

    void deleteData(int id);

    Optional<Student> getDataById(int id);

    List<Student> getData();

    List<Student> getByName(String name);
}
