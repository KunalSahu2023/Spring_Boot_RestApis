package com.javaDeveloper.springbootapi.dto;

import java.util.Set;

public class CourseDto {
    private Long id;
    private String courseName;
    private Set<String> students;  // Only student names or emails

    public CourseDto() {}

    public CourseDto(Long id, String courseName, Set<String> students) {
        this.id = id;
        this.courseName = courseName;
        this.students = students;
    }

    public Long getId() { return id; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public Set<String> getStudents() { return students; }
    public void setStudents(Set<String> students) { this.students = students; }
}
