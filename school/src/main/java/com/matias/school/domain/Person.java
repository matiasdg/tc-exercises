package com.matias.school.domain;

import java.util.Date;

public abstract class Person {

    private Integer id;
    private String name;
    private String lastname;
    private String gender;
    private Date birthDate;
    private Integer identificationNumber;

    public Person(Integer id, String name, String lastname, String gender, Date birthDate, Integer identificationNumber) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.identificationNumber = identificationNumber;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(Integer identificationNumber) {
        this.identificationNumber = identificationNumber;
    }
}

