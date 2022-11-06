package com.amaromerovic;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UtilitiesTestParameterized {
    private Utilities utilities;

    @org.junit.jupiter.api.BeforeEach
    public void start(){
        utilities = new Utilities();

    }

    public Stream<Arguments> removePairsTestConditions(){
        return Stream.of(
                Arguments.of("ABCDEFF", "ABCDEF"),
                Arguments.of("AB88EFFG", "AB8EFG"),
                Arguments.of("112233445566", "123456"),
                Arguments.of("ZYZQQB", "ZYZQB"),
                Arguments.of("A", "A")
        );
    }

    @ParameterizedTest
    @MethodSource ("removePairsTestConditions")
    public void test (String input, String expected){
        assertEquals(expected, utilities.removePairs(input));
    }
}
