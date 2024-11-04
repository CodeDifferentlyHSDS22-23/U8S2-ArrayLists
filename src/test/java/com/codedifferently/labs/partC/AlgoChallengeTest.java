package com.codedifferently.labs.partC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partC.AlgoChallenge;

public class AlgoChallengeTest {
    // Problem 26
    @Test
    public void double22Test01() {

        // Given
        String str = "kitten";

        // When
        String expected = "kikittenki";
        String actual = AlgoChallenge.double22(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void double22Test02() {

        // Given
        String str = "Ha";

        // When
        String expected = "HaHaHa";
        String actual = AlgoChallenge.double22(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void double22Test03() {

        // Given
        String str = "abc";

        // When
        String expected = "ababcab";
        String actual = AlgoChallenge.double22(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 27
    @Test
    public void range1020Test01() {

        // Given
        int a = 12;
        int b = 99;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.range1020(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void range1020Test02() {

        // Given
        int a = 21;
        int b = 12;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.range1020(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void range1020Test03() {

        // Given
        int a = 8;
        int b = 99;

        // When
        Boolean expected = false;
        Boolean actual = AlgoChallenge.range1020(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

}
