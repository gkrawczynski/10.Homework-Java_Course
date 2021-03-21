package com.course.java.service;

import com.course.java.model.*;
import lombok.NonNull;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
    private List<AirPlane> airPlanes;
    private List<Passenger> passengers;
    private List<Trip> tripList;
    private List<CrewMember> crewMembers;
    private List<Ticket> tickets;
    private List<FlightAttendant> flightAttendants;
    private Ticket ticket;

    public FlightService(List<AirPlane> airPlanes, List<Passenger> passengers, List<Trip> tripList,
                         List<CrewMember> crewMembers, List<Ticket> tickets, List<FlightAttendant> flightAttendants) {
        this.airPlanes = airPlanes;
        this.passengers = passengers;
        this.tripList = tripList;
        this.crewMembers = crewMembers;
        this.tickets = tickets;
        this.flightAttendants = flightAttendants;
    }

    public List<Trip> showAllTrips() {

        for (Trip trip : tripList) {
            System.out.println(trip);
        }

        tripList.forEach(System.out::println);

        return tripList;
    }

    public void buyTicket(@NonNull Passenger p) {
        p.setTicket(ticket); //Lista ticketow
    }

    public List<FlightAttendant> showFlightAttendantStats(@NonNull List<FlightAttendant> flightAttendantList) {
        flightAttendantList.stream()
                .filter(c -> c.getLanguagesSpoken().size() > 3)
                .collect(Collectors.toList());

        List<FlightAttendanceStats> collect = flightAttendantList.stream()
                .map(this::mapStats)
                .collect(Collectors.toList());

        return null;
    }

    private FlightAttendanceStats mapStats(FlightAttendant flightAttendant) {
        return new FlightAttendanceStats()
                .setName(flightAttendant.getFirstName())
                .setSurname(flightAttendant.getLastName());
    }

    public List<Trip> showBestTrips(@NonNull String startingPoint, @NonNull String destination) {
        double shortestLfight = tripList.stream()
                .filter(f -> f.getStartingPoint().equals(startingPoint) && f.getDestination().equals(destination))
                .min(Comparator.comparingDouble(Trip::getFlightDuration))
                .orElse(null).getFlightDuration();

        return tripList.stream().filter(f -> f.getFlightDuration() == shortestLfight).collect(Collectors.toList());
    }
}

/*
bedzie lista tripów(klasa Trip(skad, dokad, zaloga[List<CrewMember>], pasazerowie[List<Passenger>],
samolot [AirCraft], czas trwania, odleglosc))
klasa samolot(brand, model, zasieg, ilosc miesjc)
klasa Person(name, surname, age)
po Person dziedziczy Passenger(bilet (klasa Bilet(numer, cena, Trip)))
Załogoant dziecziczy po Person (salary, exp)
interfejs Pilot (#welcomePassengers()) i FlightAttendant (#showInstructions(), #giveMeals)

FlightService
#showAllTrips
#buyTicket(Passenger p)
#showPassengerStats(Passenger p) //ilosc lotow, imie, nazwisko, ilosc wyd. pieniedzi
#findBestTrip(skad, dokad)
 */