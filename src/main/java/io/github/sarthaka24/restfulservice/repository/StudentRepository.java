package io.github.sarthaka24.restfulservice.repository;

import io.github.sarthaka24.restfulservice.domain.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
}
