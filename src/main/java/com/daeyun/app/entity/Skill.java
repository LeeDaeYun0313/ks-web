package com.daeyun.app.entity;

import javax.persistence.Entity;

@Entity
public class Skill {
    private String name;
    private Integer grade;

    public Skill(){

    }

    public Skill(String name,Integer grade) {
        this.name = name;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getInteger(){
        return grade;
    }

    public void setGrade(Integer grade){
        this.grade = grade;
    }

}