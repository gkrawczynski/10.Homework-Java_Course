package com.course.java.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@ToString
public class Trip {
    private String startingPoint;
    private String destination;
    private double distanceInKilometers;
    private double flightDuration;
    private AirPlane airPlane;
    private List<CrewMember> crewMemberList;
    private List<Passenger> passengerList;
}
/*
bedzie lista tripów(klasa Trip(skad, dokad, zaloga[List<CrewMember>], pasazerowie[List<Passenger>],
samolot [AirCraft], czas trwania, odleglosc))
 */