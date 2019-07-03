package com.matias.school.domain;

import java.util.Date;
import java.util.Set;

public class Teacher extends Employe{

    private Set<Subject> subjects;

    public Teacher(Integer id, String name, String lastname, String gender, Date birthDate, Integer identificationNumber, Double salary, Date inDate, Date outDate, Boolean active, Set<Subject> subjects) {
        super(id, name, lastname, gender, birthDate, identificationNumber, salary, inDate, outDate, active);
        this.subjects = subjects;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }
}