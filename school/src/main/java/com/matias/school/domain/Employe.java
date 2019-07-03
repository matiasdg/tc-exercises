package com.matias.school.domain;

import java.util.Date;

public abstract class Employe extends Person {

    private Double salary;
    private Date inDate;
    private Date outDate;
    private Boolean active;

    public Employe(Integer id,
                   String name,
                   String lastname,
                   String gender,
                   Date birthDate,
                   Integer identificationNumber,
                   Double salary,
                   Date inDate,
                   Date outDate,
                   Boolean active) {
        super(id, name, lastname, gender, birthDate, identificationNumber);
        this.salary = salary;
        this.inDate = inDate;
        this.outDate = outDate;
        this.active = active;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}