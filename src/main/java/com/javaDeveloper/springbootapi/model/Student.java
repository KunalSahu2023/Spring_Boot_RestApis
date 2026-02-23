package com.javaDeveloper.springbootapi.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

    @Entity
    @Table(name = "students")
    public class Student {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String name;

        @Column(unique = true, nullable = false)
        private String email;

        @ManyToMany(mappedBy = "students")
        private Set<Course> courses = new HashSet<>();

        @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
        private Set<UserRole> userRoles = new HashSet<>();

        // Constructors
        public Student() {}

        public Student(String name, String email) {
            this.name = name;
            this.email = email;
        }

        // Getters and Setters
        public Long getId() { return id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public Set<Course> getCourses() { return courses; }

        public Set<UserRole> getUserRoles() { return userRoles; }
    }
