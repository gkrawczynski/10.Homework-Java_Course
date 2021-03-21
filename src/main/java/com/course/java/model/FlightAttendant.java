package com.course.java.model;

import lombok.ToString;

import java.util.Set;

@ToString
public class FlightAttendant extends CrewMember {
    private int tripsCount;
    private String position;
    private Set<Language> languagesSpoken;

    public FlightAttendant(String firstName, String lastName, int age, double salary, double yearsOfExperience, int tripsCount, String position, Set<Language> languagesSpoken) {
        super(firstName, lastName, age, salary, yearsOfExperience);
        this.tripsCount = tripsCount;
        this.position = position;
        this.languagesSpoken = languagesSpoken;
    }

    public int getTripsCount() {
        return tripsCount;
    }

    public void setTripsCount(int tripsCount) {
        this.tripsCount = tripsCount;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Set<Language> getLanguagesSpoken() {
        return languagesSpoken;
    }

    public void setLanguagesSpoken(Set<Language> languagesSpoken) {
        this.languagesSpoken = languagesSpoken;
    }

    @Override
    public String getCrewMemberType() {
        return "Flight Attendant";
    }
}
