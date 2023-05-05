package com.bnymellon.studentinformationsystem.repository;

import com.bnymellon.studentinformationsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
