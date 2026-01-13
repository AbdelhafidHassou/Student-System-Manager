package com.studentManagerSystem.Student.Manager.System.Repository;

import com.studentManagerSystem.Student.Manager.System.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
