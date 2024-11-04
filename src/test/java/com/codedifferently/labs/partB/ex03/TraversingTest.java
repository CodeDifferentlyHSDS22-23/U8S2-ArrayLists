package com.codedifferently.labs.partB.ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.ex03.Traversing;

public class TraversingTest {
    @Test
    public void traversingTest01(){
        String expected = "Gregor Clegane\n" +
                "Khal Drogo\n" +
                "Cersei Lannister\n" +
                "Sandor Clegane\n" +
                "Tyrion Lannister";
        String actual = Traversing.traversing();
        Assertions.assertEquals(expected, actual);
    }
}
