package com.course.java.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ticket {
    private long number;
    private double price;
    private Trip trip;
}
/*
bilet (klasa Bilet(numer, cena, Trip)))
 */