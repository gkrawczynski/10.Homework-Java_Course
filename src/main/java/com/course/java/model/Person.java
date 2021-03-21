package com.course.java.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void sayHi(){
        System.out.println("Hi!");
    }

    public abstract void sayType();
}
/*
klasa Person(name, surname, age)
 */