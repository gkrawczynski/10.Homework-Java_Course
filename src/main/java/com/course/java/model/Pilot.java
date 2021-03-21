package com.course.java.model;

public class Pilot extends CrewMember {
    private double flightHours;
    private String rank;

    public Pilot(String firstName, String lastName, int age, double salary, double yearsOfExperience, double flightHours, String rank) {
        super(firstName, lastName, age, salary, yearsOfExperience);
        this.flightHours = flightHours;
        this.rank = rank;
    }

    public double getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(double flightHours) {
        this.flightHours = flightHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String getCrewMemberType() {
        return "Pilot";
    }
}
