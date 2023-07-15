package com.major.assignmentportal_v1_0.repository;

import com.major.assignmentportal_v1_0.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher, String> {
}
