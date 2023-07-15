package com.major.assignmentportal_v1_0.repository;

import com.major.assignmentportal_v1_0.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, String> {
}
