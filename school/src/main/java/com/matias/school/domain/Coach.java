package com.matias.school.domain;

import java.util.Date;

public class Coach extends Employe {

    private String team;

    public Coach(Integer id,
                 String name,
                 String lastname,
                 String gender,
                 Date birthDate,
                 Integer identificationNumber,
                 Double salary,
                 Date inDate,
                 Date outDate,
                 Boolean active,
                 String team) {
        super(id, name, lastname, gender, birthDate, identificationNumber, salary, inDate, outDate, active);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}