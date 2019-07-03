package com.matias.bookings.domain;

public abstract class User {

    private Integer id;
    private String name;
    private String lastname;
    private String email;
    private String job;

    public User(Integer id, String name, String lastname, String email, String job) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.job = job;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
