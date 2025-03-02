package com.zipcodewilmington.scientificcalculator;
import java.math.BigInteger;
import java.lang.Math;


public class Science {

    public static double square(double num){
        return num*num;
    }
    public static double pow(double a, double b){
        return Math.pow(a, b);
    }
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
    public static double sin(double num) {
        return Math.sin(num);
    }
    public static double cos(double num) {
        return Math.cos(num);
    }
    public static double tan(double num) {
        return Math.tan(num);
    }
    public static double inverseCos(double num) {
        return Math.acos(num);
    }
    public double inverseTan(double num) {
        return Math.atan(num);
    }
        //using BigInteger import
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

    //Degrees
    public static double degrees(double num) {
        return Math.toDegrees(num);
    }

    //Radians
    public static double radians(double num) {
            return Math.toRadians(num);
    }

    //Log
    public static double log(double num) {
        return Math.log(num);

    }

    //Inverse Log
    public static double log10(double num) {
        return Math.log10(num);
    }

    //Natural logarithm
    public static double log1p(double num) {
        return Math.log1p(num);
    }
    //Inverse Natural Log
    public static double inverseNL(double num) {
        return Math.exp(num);
    }

}


