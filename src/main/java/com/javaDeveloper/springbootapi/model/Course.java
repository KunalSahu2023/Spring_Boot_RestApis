package com.javaDeveloper.springbootapi.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

    @Entity
    @Table(name = "courses")
    public class Course {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String courseName;

        @ManyToMany
        @JoinTable(
                name = "student_course",
                joinColumns = @JoinColumn(name = "course_id"),
                inverseJoinColumns = @JoinColumn(name = "student_id")
        )
        private Set<Student> students = new HashSet<>();

        public Course() {}

        public Course(String courseName) {
            this.courseName = courseName;
        }

        public Long getId() { return id; }

        public String getCourseName() { return courseName; }
        public void setCourseName(String courseName) { this.courseName = courseName; }

        public Set<Student> getStudents() { return students; }
    }
