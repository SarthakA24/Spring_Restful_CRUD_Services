package io.github.sarthaka24.restfulservice.service;

import java.util.List;

public interface IStudentService<T> {
    boolean saveData(T t);

    boolean deleteData(int id);

    boolean updateData(T t);

    List<T> getData();
}
