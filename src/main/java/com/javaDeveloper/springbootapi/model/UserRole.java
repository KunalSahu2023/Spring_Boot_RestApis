package com.javaDeveloper.springbootapi.model;

import jakarta.persistence.*;

    @Entity
    @Table(name = "user_roles")
    public class UserRole {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "student_id", nullable = false)
        private Student student;

        @ManyToOne
        @JoinColumn(name = "role_id", nullable = false)
        private Role role;

        public UserRole() {}

        public UserRole(Student student, Role role) {
            this.student = student;
            this.role = role;
        }

        public Long getId() { return id; }

        public Student getStudent() { return student; }
        public void setStudent(Student student) { this.student = student; }

        public Role getRole() { return role; }
        public void setRole(Role role) { this.role = role; }
    }