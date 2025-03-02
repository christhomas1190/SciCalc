package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;
import java.util.Scanner;

public class Science {

    public double square(double num){
        return num*num;
    }
    public double pow(double a, double b){
        return Math.pow(a, b);
    }
    public static double squareRt(double num) {
        return Math.sqrt(num);
    }
    public double inverse(double num) {
        return 1 / num;
    }

    //If absolute value of number is greater than 1 the result will be NaN
    public double inverseSine(double num) {
        return Math.asin(num);
    }
    public double switchSign(double num) {
        return Math.signum(num);
    }
    public double sin(double num) {
        return Math.sin(num);
    }
    public double cos(double num) {
        return Math.cos(num);
    }
    public double tan(double num) {
        return Math.tan(num);
    }
    public double inverseCos(double num) {
        return Math.acos(num);
    }
    public double inverseTan(double num) {
        return Math.atan(num);
    }
////    public double factorial(double num) {
////        int i = 0;
////        for (i = 0; i <= num; i++) {
////            return num * i;
////        }
////    }
//
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

}


