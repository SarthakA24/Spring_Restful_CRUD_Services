package io.github.sarthaka24.restfulservice.repository;

import io.github.sarthaka24.restfulservice.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByName(String name);

    List<Student> findByNameStartsWith(String name);
}
