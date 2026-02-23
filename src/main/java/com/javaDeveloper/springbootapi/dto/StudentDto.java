package com.javaDeveloper.springbootapi.dto;

import java.util.Set;

public class StudentDto {
    private Long id;
    private String name;
    private String email;
    private Set<String> roles;
    private Set<String> courses;

    public StudentDto() {}

    public StudentDto(Long id, String name, String email,
                      Set<String> roles, Set<String> courses) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.roles = roles;
        this.courses = courses;
    }

    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Set<String> getRoles() { return roles; }
    public void setRoles(Set<String> roles) { this.roles = roles; }

    public Set<String> getCourses() { return courses; }
    public void setCourses(Set<String> courses) { this.courses = courses; }

}
