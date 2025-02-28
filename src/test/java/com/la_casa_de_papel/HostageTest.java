package com.la_casa_de_papel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HostageTest {

    Hostage monica;
    Hostage arturo;

    @BeforeEach
    void setupBeforeEach(){
        monica = new Hostage("Mónica", "Gaztambide", "secretary");

        arturo = new Hostage("Arturo", "Román", "director");
    }

    @Test
    void shouldActAsAHostage(){
        String monicaExpected = "Mónica that is the secretary is down on the floor in the middle of the robbery.";
        String arturoExpected = "Arturo that is the director is down on the floor in the middle of the robbery.";

        String monicaActual = monica.act();
        String arturoActual = arturo.act();

        assertEquals(monicaExpected, monicaActual);
        assertEquals(arturoExpected, arturoActual);
    }
    
}
