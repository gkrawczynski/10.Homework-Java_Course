package com.course.java.model;

import lombok.Data;

@Data
public class CrewMember extends Person {
    private double salary;
    private double yearsOfExperience;

    public CrewMember(String firstName, String lastName, int age, double salary, double yearsOfExperience) {
        super(firstName, lastName, age);
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getCrewMemberType(){
        return "CrewMember";
    }

    @Override
    public void sayType() {
        System.out.println("CrewMember");
    }
}
/*
Załogoant dziecziczy po Person (salary, exp)
 */