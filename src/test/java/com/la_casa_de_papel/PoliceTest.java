package com.la_casa_de_papel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PoliceTest {

    Police raquel;
    
    @BeforeEach
    void setupBeforeEach(){
        raquel = new Police("Raquel", "Murillo", "inspector");
    }

    @Test
    void shouldActAsAPolice(){
        String raquelExpected = "Raquel the inspector is trying to negotiate the release of the hostages.";
        String raquelActual = raquel.act();
        assertEquals(raquelExpected, raquelActual);
    }

    @Test
    void shouldExecutePlanAsAPolice(){
        String raquelExpected = "Try to contact the leader of the gang, find out how many hostages there are and negotiate their release.";
        String raquelActual = raquel.executePlan();
        assertEquals(raquelExpected, raquelActual);
    }
}
