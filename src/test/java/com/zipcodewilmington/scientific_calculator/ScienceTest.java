package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Science;
import org.junit.Test;

import static java.lang.Double.NaN;
import static org.junit.Assert.assertEquals;

public class ScienceTest {

    @Test

    public void testsquare1() {
        Science science1 = new Science();
        double actual = science1.square(9.0);
        assertEquals(81, actual, 0.001);
    }

    @Test
    public void testsquare2() {
        Science science1 = new Science();
        double actual = science1.square(4);
        assertEquals(16, actual, 0.001);
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

    @Test
    public void testpow() {
        Science science1 = new Science();
        double actual = science1.pow(5, 4);
        assertEquals(625, actual, 0.001);
    }

    @Test
    public void testadd(){
        Science science1 = new Science();
        double actual = science1.addition(10, 2);
        assertEquals(12, actual , 0.001);
    }

    @Test
    public void testinverseCos(){
        Science science1 = new Science();
        double actual = science1.inverseCos(2);
        assertEquals(NaN, actual, 0.0001);
    }
    @Test
    public void testinverse(){
        Science science1 = new Science();
        double actual = science1.inverse(10);
        assertEquals(0.1, actual , 0.000001);
    }

    @Test
    public void testinverseSine(){
        Science science1 = new Science();
        double actual = science1.inverseSine(10);
        assertEquals(NaN, actual , 0.000001);
    }

    @Test
    public void testswitchSign(){
        Science science1 = new Science();
        double actual = science1.switchSign(10);
        assertEquals(1, actual , 0.000001);
    }

    @Test
    public void testcos(){
        Science science1 = new Science();
        double actual = science1.cos(10);
        assertEquals(-0.8390715290764524, actual , 0.000001);
    }

    @Test
    public void testtan(){
        Science science1 = new Science();
        double actual = science1.tan(10);
        assertEquals(0.6483608274590866, actual , 0.000001);
    }

    @Test
    public void testinversetan(){
        Science science1 = new Science();
        double actual = science1.inverseTan(3);
        assertEquals(1.2490457723982544, actual , 0.000001);
    }

    @Test
    public void testsub(){
        Science science1 = new Science();
        double actual = science1.subtraction(3, 10);
        assertEquals(-7, actual , 0.000001);
    }

    @Test
    public void testmulti(){
        Science science1 = new Science();
        double actual = science1.multiplication(-3, 10);
        assertEquals(-30, actual , 0.000001);
    }

    @Test
    public void testdivision(){ //test will throw
        // ArithmeticException("Can't divide by 0") if dividing by zero
        Science science1 = new Science();
        double actual = science1.division(-3, 10);
        assertEquals(-0.3, actual , 0.000001);
    }

    @Test
    public void testdegrees(){
        Science science1 = new Science();
        double actual = science1.degrees(10);
        assertEquals(0.17453292519943295, actual , 0.000001);
    }

    @Test
    public void testlog10(){
        Science science1 = new Science();
        double actual = science1.log10(5);
        assertEquals(0.6989700043360189, actual , 0.000001);
    }

    @Test
    public void testlog1p(){
        Science science1 = new Science();
        double actual = science1.log1p(5);
        assertEquals(1.791759469228055, actual , 0.000001);
    }

    @Test
    public void testinverseNL(){
        Science science1 = new Science();
        double actual = science1.inverseNL(5);
        assertEquals(5, actual , 0.000001);
    }
    @Test
    public void testradians(){
        Science science1 = new Science();
        double actual = science1.radians(10);
        assertEquals(572.9577951308232, actual , 0.000001);
    }







}




