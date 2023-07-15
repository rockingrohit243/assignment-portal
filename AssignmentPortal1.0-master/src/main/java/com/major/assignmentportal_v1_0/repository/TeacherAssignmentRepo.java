package com.major.assignmentportal_v1_0.repository;

import com.major.assignmentportal_v1_0.entities.TeacherAssignment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherAssignmentRepo extends JpaRepository<TeacherAssignment, String> {

}
