package io.github.sarthaka24.restfulservice.repository;

import io.github.sarthaka24.restfulservice.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
