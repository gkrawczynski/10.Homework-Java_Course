package com.course.java.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AirCraft {
    private String brand;
    private String model;
    private int range;
    private int maxSpeed;
    private int numberOfSeats;
}
/*
klasa samolot(brand, model, zasieg, ilosc miesjc)
 */