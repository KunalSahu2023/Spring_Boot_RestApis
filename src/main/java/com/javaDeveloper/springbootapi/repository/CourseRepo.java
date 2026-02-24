package com.javaDeveloper.springbootapi.repository;

import com.javaDeveloper.springbootapi.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Long> {
}
