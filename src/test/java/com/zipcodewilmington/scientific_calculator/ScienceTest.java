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
}


