package com.amaromerovic;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    private Utilities utilities;

    @org.junit.jupiter.api.BeforeEach
    public void start(){
        utilities = new Utilities();
    }

    // REMOVE EVERYNTHCHAR METHOD
    @org.junit.jupiter.api.Test
    void everyNthChar_exampleOne() {
        String help = "hello";
        char[] input = help.toCharArray();
        assertArrayEquals(new char[]{'e', 'l'}, utilities.everyNthChar(input, 2));
    }

    @org.junit.jupiter.api.Test
    void everyNthChar_exampleTwo() {
        String help = "hello";
        char[] input = help.toCharArray();
        assertArrayEquals(new char[]{'h','e','l', 'l', 'o'}, utilities.everyNthChar(input, 10));
    }




    // REMOVE PAIRS METHOD
    @org.junit.jupiter.api.Test
    void removePairs_exampleOne() {
        String input = "ABBCDEEF";
        String output = utilities.removePairs(input);
        assertEquals("ABCDEF", output);
    }

    @org.junit.jupiter.api.Test
    void removePairs_exampleTwo() {
        String input = "ABCCABDEEF";
        String output = utilities.removePairs(input);
        assertEquals("ABCABDEF", output);
    }

    @org.junit.jupiter.api.Test
    void removePairs_exampleThree() {
        String input = "A";
        String output = utilities.removePairs(input);
        assertEquals("A", output);
    }

    @org.junit.jupiter.api.Test
    void removePairs_exampleFour() {
        String input = null;
        String output = utilities.removePairs(input);
        assertNull(output, "Null wasn't returned, check if it was passed as an argument! CAREFUL");
    }

    @org.junit.jupiter.api.Test
    void removePairs_exampleFive() {
        String input = "";
        String output = utilities.removePairs(input);
        assertEquals("", output);
    }




    // REMOVE CONVERTER METHOD
    @org.junit.jupiter.api.Test
    void converter_exampleOne() {
        assertEquals(300, utilities.converter(10, 5));
    }

    @org.junit.jupiter.api.Test
    void converter_exampleTwo() {
        assertThrows(ArithmeticException.class , () -> utilities.converter(10, 0));
    }








    // REMOVE NULLIFODDLENGHT METHOD
    @org.junit.jupiter.api.Test
    void nullIfOddLength_exampleOne() {
        String help = "Amar";
        assertNotNull(utilities.nullIfOddLength(help));
    }

    @org.junit.jupiter.api.Test
    void nullIfOddLength_exampleTwo() {
        String help = "Hello";
        assertNull(utilities.nullIfOddLength(help));
    }
}