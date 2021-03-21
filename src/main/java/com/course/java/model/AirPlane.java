package com.course.java.model;

public class AirPlane extends AirCraft {
    private int numberOfEngines;

    public AirPlane(String brand, String model, Integer range, Integer numberOfSeats, Integer maxSpeed, int numberOfEngines) {
        super(brand, model, range, numberOfSeats, maxSpeed);
        this.numberOfEngines = numberOfEngines;
    }
}
