package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Science {

//    public double square(double num){
//        return num*num;
//    }
//    public double pow(double a, double b){
//        return Math.pow(a, b);
//    }
//    public static double squareRt(double num) {
//        double squareRt = Math.sqrt(num);
//
//        return squareRt;
//    }
//    public double inverse(double num) {
//        return inverse(num);
//    }
//    public double inverseSine(double num) {
//        return inverseSine(num);
//    }
//    public double switchSign(double num) {return switchSign(num);}
//    public double sin(double num) {
//        return Math.sin(num);
//    }
//    public double cos(double num) {
//        return Math.cos(num);
//    }
//    public double tan(double num) {return Math.tan(num);}
//    public double inverseCos(double num) {return Math.acos(num);}
//    public double inverseTan(double num) {
//        return Math.atan(num);
//    }
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
}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Science science = new Science();
//        double number = scanner.nextDouble();
//        double result = science.squareRt(number);
//        System.out.println("The square root of " + number + " is: " + result);
//    }
//};
