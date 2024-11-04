package com.codedifferently.labs.partB.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.ex02.ArrayList2;

public class ArrayList2Test {
    @Test
    public void arrayList2Test01(){
        String expected = "Apple\n" +
                "Banana\n" +
                "Grapes\n" +
                "Mango\n" +
                "Sorting numbers...\n" +
                "1\n" +
                "11\n" +
                "21\n" +
                "51";
        String actual = ArrayList2.arrayListPractice2();
        Assertions.assertEquals(expected, actual);
    }
}
