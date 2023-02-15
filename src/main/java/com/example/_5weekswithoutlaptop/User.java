package com.example._5weekswithoutlaptop;

public class User {
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String location;
    private String gender;

    public User(String firstname, String lastname, String username, String password, String location, String gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.location = location;
        this.gender = gender;
    }

    public User() {}


    public String getUsername() {
        return username;
    }

    public String getLocation() {
        return location;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}