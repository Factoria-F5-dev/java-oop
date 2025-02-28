package com.la_casa_de_papel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ThiefTest {

    Thief professor;
    Thief berlin;
    Thief tokyo;
    Thief nairobi;
    Thief rio;
    Thief denver;   
    Thief helsinki;
    Thief moscow;   
    Thief oslo;


    @BeforeEach
    void setupBeforeEach(){
        professor = new Thief("Sergio", "Marquina", "Professor", "leader", List.of("robbery", "planning", "negotiation", "author"));
        
        berlin = new Thief("Andrés", "Marquina", "Berlin", "second in command", List.of("robbery"));

        tokyo = new Thief("Silene", "Oliveira", "Tokyo", "executor", List.of("robbery", "killer"));

        nairobi = new Thief("Agata", "Jiménez", "Nairobi", "executive", List.of("robbery", "money counterfeiter"));

        rio = new Thief("Aníbal", "Cortés", "Rio", "hacker", List.of("computer expert"));

        denver = new Thief("Ricardo", "Ramos", "Denver", "executor", List.of("robbery", "hardworker"));

        helsinki = new Thief("Mirko", "Dragić", "Helsinki", "executor", List.of("weapons expert", "war soldier", "explosives expert"));

        moscow = new Thief("Agustín", "Ramos", "Moscow", "executor", List.of("mining", "safe cracking", "hard work", "explosivist"));

        oslo = new Thief("Radko", "Dragić", "Oslo", "executor", List.of("weapons expert", "war soldier"));
    }
    
    @Test
    void shouldActAsAThief(){
        String professorExpected = "Professor that is the leader is stealing the bank.";
        String berlinExpected = "Berlin that is the second in command is stealing the bank.";
        String tokyoExpected = "Tokyo that is the executor is stealing the bank.";
        String nairobiExpected = "Nairobi that is the executive is stealing the bank.";
        String rioExpected = "Rio that is the hacker is stealing the bank.";
        String denverExpected = "Denver that is the executor is stealing the bank.";
        String helsinkiExpected = "Helsinki that is the executor is stealing the bank.";
        String moscowExpected = "Moscow that is the executor is stealing the bank.";
        String osloExpected = "Oslo that is the executor is stealing the bank.";


        String professorActual = professor.act();
        String berlinActual = berlin.act();
        String tokyoActual = tokyo.act();
        String nairobiActual = nairobi.act();
        String rioActual = rio.act();
        String denverActual = denver.act();
        String helsinkiActual = helsinki.act();
        String moscowActual = moscow.act();
        String osloActual = oslo.act();

        assertEquals(professorExpected, professorActual);
        assertEquals(berlinExpected, berlinActual);
        assertEquals(tokyoExpected, tokyoActual);
        assertEquals(nairobiExpected, nairobiActual);
        assertEquals(rioExpected, rioActual);
        assertEquals(denverExpected, denverActual);
        assertEquals(helsinkiExpected, helsinkiActual);
        assertEquals(moscowExpected, moscowActual);
        assertEquals(osloExpected, osloActual);
    }

    @Test
    void shouldExecutePlanAsAThief(){
        String expected = "Enter the building, close the doors, take out the weapons, gather the hostages and start the plan to print money.";    
        String professorActual = professor.executePlan();
        String berlinActual = berlin.executePlan();
        String tokyoActual = tokyo.executePlan();
        String nairobiActual = nairobi.executePlan();
        String rioActual = rio.executePlan();
        String denverActual = denver.executePlan();
        String helsinkiActual = helsinki.executePlan();
        String moscowActual = moscow.executePlan();
        String osloActual = oslo.executePlan();

        assertEquals(expected, professorActual);
        assertEquals(expected, berlinActual);
        assertEquals(expected, tokyoActual);
        assertEquals(expected, nairobiActual);
        assertEquals(expected, rioActual);
        assertEquals(expected, denverActual);
        assertEquals(expected, helsinkiActual);
        assertEquals(expected, moscowActual);
        assertEquals(expected, osloActual);
    }
}
