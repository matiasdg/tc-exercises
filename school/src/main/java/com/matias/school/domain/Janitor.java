package com.matias.school.domain;


import java.util.Date;

public class Janitor extends Employe{

    public Janitor(Integer id, String name, String lastname, String gender, Date birthDate, Integer identificationNumber, Double salary, Date inDate, Date outDate, Boolean active) {
        super(id, name, lastname, gender, birthDate, identificationNumber, salary, inDate, outDate, active);
    }
}