package com.course.java.service;

import com.course.java.model.CrewMember;
import com.course.java.model.FlightAttendant;
import com.course.java.model.Pilot;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class CrewService {
    private List<CrewMember> crewMembers;
    private List<Pilot> pilots; //1.

    public List<Pilot> getBestPilot() { //CrewMember
        double mostFlightHours = pilots.stream() //try catch
                .max(Comparator.comparingDouble(Pilot::getFlightHours))
                .orElse(null).getFlightHours();

        return getPilots().stream()
                .filter(f -> f.getFlightHours() == mostFlightHours)
                .collect(Collectors.toList());
    }

    public List<CrewMember> getBestFlightAttendant() {
        double mostExperience = crewMembers.stream()
                .filter(FlightAttendant.class::isInstance)
                .map(FlightAttendant.class::cast)//1.
                .max(Comparator.comparingDouble(CrewMember::getYearsOfExperience))
                .orElse(null).getYearsOfExperience();

        return getCrewMembers().stream()
                .filter(f -> f.getYearsOfExperience() == mostExperience)
                .collect(Collectors.toList());
    }
}
/*
PersonService
#findBestPilot - znajdz najleposzego pilota, czyli tego z najwieksza iloscia wylatanych godzin
#findBest... - znajdz najlepszego ..., czyli tego z najwieszym expem
#
*/