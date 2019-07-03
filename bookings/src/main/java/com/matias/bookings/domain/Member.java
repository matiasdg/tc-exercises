package com.matias.bookings.domain;

public class Member extends User {

    private Boolean willAtend;

    public Member(Integer id, String name, String lastname, String email, String job) {
        super(id, name, lastname, email, job);
    }
}
