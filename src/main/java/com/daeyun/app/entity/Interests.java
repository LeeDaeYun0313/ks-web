package com.daeyun.app.entity;

import javax.persistence.Entity;

@Entity
public class Interests {
    private String name;

    public Interests(){

    }
    public Interests(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}