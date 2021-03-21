package com.course.java.service;

import com.course.java.model.CrewMember;
import com.course.java.model.FlightAttendant;
import com.course.java.model.Language;
import com.course.java.model.Pilot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class CrewServiceTest {
    private CrewService crewService;
    private List<CrewMember> crewMembers = new ArrayList<>();
    private List<CrewMember> pilots1;
    private List<Pilot> pilots2;
    private List<CrewMember> flightAttendants;
    private Set<Language> languagesSpoken1;
    private Set<Language> languagesSpoken2;
    private Set<Language> languagesSpoken3;
    private Set<Language> languagesSpoken4;

    @Before
    public void setUp() throws Exception {
        pilots1 = initPilotList1();
        pilots2 = initPilotList2();
        flightAttendants = initFlightAttendantList();


        FlightAttendant flightAttendant = (FlightAttendant) flightAttendants.get(0);
        for (Language s : flightAttendant.getLanguagesSpoken()) {
            if (s == Language.ENGLISH){

            }
        }

        languagesSpoken1 = initLanguagesSpoken1();
        languagesSpoken2 = initLanguagesSpoken1();
        languagesSpoken3 = initLanguagesSpoken1();
        languagesSpoken4 = initLanguagesSpoken1();
        crewMembers.addAll(pilots1);
        crewMembers.addAll(flightAttendants);
        crewService = new CrewService(crewMembers, pilots2);

    }

    private List<CrewMember> initPilotList1() {
        return new ArrayList<>(List.of(
                new Pilot("Alex", "Conklin", 38, 65000.40, 6.5,
                        2000.2, "First Officer"),
                new Pilot("Bill", "Gateman", 45, 75000.40, 12.3,
                        4021.2, "Captain"),
                new Pilot("Cameron", "Davis", 41, 55000.40, 9.4,
                        3421.2, "Captain"),
                new Pilot("Dave", "Jones", 34, 25000.40, 4.6,
                        1823.2, "Second Officer"),
                new Pilot("George", "Coltman", 37, 35000.40, 6.1,
                        1521.2, "First Officer"),
                new Pilot("Harry", "Potman", 40, 45000.40, 8.9,
                        2721.2, "Captain"),
                new Pilot("Jack", "Norman", 32, 15000.40, 3.2,
                        1521.2, "Second Officer")
        ));
    }

    private List<Pilot> initPilotList2() {
        return new ArrayList<>(List.of(
                new Pilot("Alex", "Conklin", 38, 65000.40, 6.5,
                        2000.2, "First Officer"),
                new Pilot("Bill", "Gateman", 45, 75000.40, 12.3,
                        4021.2, "Captain"),
                new Pilot("Cameron", "Davis", 41, 55000.40, 9.4,
                        3421.2, "Captain"),
                new Pilot("Dave", "Jones", 34, 25000.40, 4.6,
                        1823.2, "Second Officer"),
                new Pilot("George", "Coltman", 37, 35000.40, 6.1,
                        1521.2, "First Officer"),
                new Pilot("Harry", "Potman", 40, 45000.40, 8.9,
                        2721.2, "Captain"),
                new Pilot("Jack", "Norman", 32, 15000.40, 3.2,
                        1521.2, "Second Officer")
        ));
    }

    private List<CrewMember> initFlightAttendantList() {
        return new ArrayList<>(List.of(
                new FlightAttendant("Alice", "Macmann", 28, 23000.60,
                        13.1, 48,
                        "Cabin Attendant", initLanguagesSpoken1()),
                new FlightAttendant("Barbara", "Brown", 27, 24000.17,
                        7.8, 56,
                        "Cabin Attendant", initLanguagesSpoken2()),
                new FlightAttendant("Celia", "Smith", 26, 24000.17,
                        7.8, 56,
                        "Cabin Attendant", initLanguagesSpoken3()),
                new FlightAttendant("Daria", "Wright", 25, 24000.17,
                        7.8, 56,
                        "Cabin Attendant", initLanguagesSpoken3()),
                new FlightAttendant("Eliza", "Napanee", 24, 24000.17,
                        7.8, 56,
                        "Cabin Attendant", initLanguagesSpoken4()),
                new FlightAttendant("Francesca", "Totti", 23, 24000.17,
                        7.8, 56,
                        "Cabin Attendant", initLanguagesSpoken1()),
                new FlightAttendant("Hermiona", "Greensgate", 22, 24000.17,
                        7.8, 56,
                        "Cabin Attendant", initLanguagesSpoken2()),
                new FlightAttendant("Janine", "Jackson", 29, 24000.17,
                        7.8, 56,
                        "Cabin Attendant", initLanguagesSpoken4())
        ));
    }

    private Set<Language> initLanguagesSpoken1() {
        return Set.of(Language.ENGLISH, Language.FRENCH, Language.SPANISH);
    }

    private Set<Language> initLanguagesSpoken2() {
        return Set.of(Language.ENGLISH, Language.GERMAN, Language.DUTCH);
    }

    private Set<Language> initLanguagesSpoken3() {
        return Set.of(Language.valueOf("English "), Language.NORWEGIAN, Language.SWEDISH, Language.DANISH); //trim()??
    }

    private Set<Language> initLanguagesSpoken4() {
        return Set.of(Language.ENGLISH, Language.PORTUGUESE, Language.SPANISH);
    }

    @Test
    public void shouldReturnBestPilot() {
        //given
        List<Pilot> bestPilots = List.of(pilots2.get(1));

        //when
        List<Pilot> result = crewService.getBestPilot();

        //then
        Assert.assertEquals(bestPilots, result);
    }

    @Test
    public void shouldReturnBestFlightAttendant() {
        //given
        List<CrewMember> betFlightAttendant = List.of(flightAttendants.get(0));

        //when
        List<CrewMember> result = crewService.getBestFlightAttendant();

        //then
        Assert.assertEquals(betFlightAttendant, result);

    }
}