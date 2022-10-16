package org.launchcode.spaday.models;

import java.time.LocalDate;

public class User {
    private int id;
    private static int nextId = 1;
    private String username;
    private String email;
    private String password;

    private LocalDate date;

    public User() {
        this.id=nextId;
        nextId++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
