package com.zipcodewilmington.scientificcalculator;
import java.math.BigInteger;
import java.lang.Math;


public class Science {


    public static double square(double num){
        return num*num;
    }
    //Returns the value of the first argument raised to the power of the second argument
    public static double pow(double a, double b){
        return Math.pow(a, b);
    }
    //Returns the correctly rounded positive square root of a double value
    public static double squareRt(double num) {
        return Math.sqrt(num);
    }

    public static double inverse(double num) {
        return 1 / num;
    }

    //If absolute value of number is greater than 1 the result will be NaN
    public static double inverseSine(double num) {
        return Math.asin(num);
    }

    //Returns sign of number 1 for positive, -1 for negative and 0 for zero
    public static double switchSign(double num) {
        return Math.signum(num);
    }
    //Returns the trigonometric sine of an angle
    public static double sin(double num) {
        return Math.sin(num);
    }
    //Returns the trigonometric cosine of an angle
    public static double cos(double num) {
        return Math.cos(num);
    }
    //Returns the trigonometric tangent of an angle
    public static double tan(double num) {
        return Math.tan(num);
    }
    //Returns the arc cosine of a value; the returned angle is in the range 0.0 through pi.
    public static double inverseCos(double num) {
        return Math.acos(num);
    }
    //Returns the arc tangent of a value; the returned angle is in the range -pi/ 2 through pi/ 2
    public double inverseTan(double num) {
        return Math.atan(num);
    }
        //using BigInteger import...returns the product of all positive integers less than or equal
        // to a given positive integer
    public static BigInteger factorial(int num) {
        BigInteger b = new BigInteger("1");
        for(int i = 2; i <= num; i++){
            b = b.multiply(BigInteger.valueOf(i));
        }
        return b;
    }

    //Addition
    public static double addition(double a, double b) {
        return a + b;
    }
    //Subtract
    public static double subtraction(double a, double b) {
        return a - b;
    }

    //Multiplication
    public static double multiplication(double a, double b) {
        return a * b;
    }

    //Division
    public static double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Can't divide by 0");
        } else {
            return a / b;
        }
    }

    //Degrees: Converts an angle measured in radians to an
    // approximately equivalent angle measured in degrees.
    public static double degrees(double num) {
        return Math.toDegrees(num);
    }

    //Radians: Converts an angle measured in degrees to an
    // approximately equivalent angle measured in radians.
    public static double radians(double num) {
            return Math.toRadians(num);
    }

    //Log: Returns the natural logarithm (base e) of a double value.
    public static double log(double num) {
        return Math.log(num);

    }

    //Inverse Log: Returns the base 10 logarithm of a double value.
    public static double log10(double num) {
        return Math.log10(num);
    }

    //Natural logarithm: Returns the natural logarithm of the sum of the argument and 1.
    public static double log1p(double num) {
        return Math.log1p(num);
    }
    //Inverse Natural Log: Returns Euler's number e raised to the power of a double value.
    public static double inverseNL(double num) {
        return Math.exp(num);
    }

    //Store memory
    public static double storeMemory(double a, double b){
        return a = b;
    }
    //reset memory
    public static double resetMemory(double a){
        return a = 0;
    }
    //recall memory
    public static double recallMemory(double a, double b){
        return a = b;
    }

}


