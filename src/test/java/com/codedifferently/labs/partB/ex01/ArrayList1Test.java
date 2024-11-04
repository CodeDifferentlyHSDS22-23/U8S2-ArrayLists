package com.codedifferently.labs.partB.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.ex01.ArrayList1;

public class ArrayList1Test {
    @Test
    public void arrayList1Test01(){
        String expected = "[Steve, Tim, Lucy, Pat, Angela, Tom]\n" +
                "[Tim, Lucy, Pat, Tom]\n" +
                "[Tim, Lucy, Tom]";
        String actual = ArrayList1.arrayListPractice1();
        Assertions.assertEquals(expected, actual);
    }
}
