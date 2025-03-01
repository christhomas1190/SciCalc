package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Science {

    public double square(double num){
        return num*num;
    }
    public double pow(double a, double b){
        return Math.pow(a, b);
    }
    public double squareRt(double num) {
        return Math.sqrt(num);
    }
    public double inverse(double num) {
        return inverse(num);
    }
    public double inverseSine(double num) {
        return inverseSine(num);
    }
    public double switchSign(double num) {
        return switchSign(num);
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
    public double factorial(double num) {
        int i = 0;
        for (i = 0; i <= num; i++) {
            return num * i;
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Science science = new Science();
        System.out.print("Enter a number to find the square root: ");
        double number = scanner.nextDouble();
        double result = science.squareRt(number);
        System.out.println("The square root of " + number + " is: " + result);
    }
};
