package io.github.sarthaka24.restfulservice.service;

import java.util.List;

public interface IStudentService<T> {
    T saveData(T t);

    void deleteData(int id);

    List<T> getData();
}
