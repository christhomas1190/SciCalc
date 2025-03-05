package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Science;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScienceTest {

    @Test

    public void testsquare1() {
        Science science1 = new Science();
        double actual = science1.square(12);
        assertEquals(144.0, actual, 0.001);
    }

    @Test
    public void testsquare2() {
        Science science1 = new Science();
        double actual = science1.square(12);
        assertEquals(144.0, actual, 0.001);
    }

    @Test
    public void testsquare3() {
        Science science1 = new Science();
        double actual = science1.square(12);
        assertEquals(144.0, actual, 0.001);
    }

    @Test
    public void testsquareRt() {
        Science science1 = new Science();
        double actual = science1.squareRt(25);
        assertEquals(5, actual, 0.001);
    }

    @Test
    public void testlog() {
        Science science1 = new Science();
        double actual = science1.log(10);
        assertEquals(2.302585092994046, actual, 0.001);
    }

    @Test
    public void testfactorial() {
        Science science1 = new Science();
        int actual = science1.factorial(5);
        assertEquals(120.0, actual, 0001);
    }

    @Test
    public void testsin() {
        Science science1 = new Science();
        double actual = science1.sin(20);
        assertEquals(0.9129452507276277, actual, 0.001);
    }
}

//test


