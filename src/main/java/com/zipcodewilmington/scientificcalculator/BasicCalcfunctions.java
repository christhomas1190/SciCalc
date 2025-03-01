package com.zipcodewilmington.scientificcalculator;

import java.util.scanner;
import java.lang.Math;


Public class BasicCalcfunctions {

    //Add
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

    public static double Memory(double a, double b) {
        return a=b;
    }
}
