package com.matias.school.domain;

public class Subject {

    private Integer id;
    private String name;
    private Integer level;

    public Subject(Integer id, String name){
        this.id = id;
        this.name = name;
    };


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
