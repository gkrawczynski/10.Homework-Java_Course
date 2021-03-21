package com.course.java.model;

public class Passenger extends Person {
    private Ticket ticket; //Lista

    public Passenger(String firstName, String lastName, int age, Ticket ticket) {
        super(firstName, lastName, age);
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void sayType() {
        System.out.println("Passenger");
    }
}
/*
po Person dziedziczy Passenger(bilet (klasa Bilet(numer, cena, Trip)))
 */