package com.codedifferently.labs.partA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ArrayList;

public class ArrayListTest {
    @Test
    public void traversingTest01(){
        String expected = "scores 66\n" +
                "scores 79\n" +
                "scores 95\n" +
                "scores 84\n" +
                "scores [79, 95]\n";
        String actual = ArrayList.arrayListPractice();
        Assertions.assertEquals(expected, actual);
    }
}
