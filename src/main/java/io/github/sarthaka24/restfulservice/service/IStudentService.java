package io.github.sarthaka24.restfulservice.service;

import java.util.List;
import java.util.Optional;

public interface IStudentService<T> {
    T saveData(T t);

    void deleteData(int id);

    Optional<T> getDataById(int id);

    List<T> getData();
}
