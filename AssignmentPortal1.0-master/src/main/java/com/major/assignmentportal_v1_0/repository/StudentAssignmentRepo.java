package com.major.assignmentportal_v1_0.repository;

import com.major.assignmentportal_v1_0.entities.StudentAssignment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentAssignmentRepo extends JpaRepository<StudentAssignment, String> {}
