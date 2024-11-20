package com.example.demo.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
    @Entity
    @Table(name = "users")
    public class User {
    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    @Column(nullable = false, unique = true)
        private String username;

        @Column(nullable = false)
        private String password;

        @Column(nullable = false)
        private String role; // e.g., USER, ADMIN

        private String email;
    }
