package com.matias.school.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class Student extends Person implements Serializable {

    private Integer id;
    private Integer fileNumber;
    private Set<Subject> subjects;

    public Student(Integer id, String name, String lastname, String gender, Date birthDate, Integer identificationNumber, Integer fileNumber, Set<Subject> subjects) {
        super(id, name, lastname, gender, birthDate, identificationNumber);
        this.fileNumber = fileNumber;
        this.subjects = subjects;
    }

    public Integer getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(Integer fileNumber) {
        this.fileNumber = fileNumber;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }
}