package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to my scientific calculator");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" Choose an operation");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
        System.out.println("13");

            int choice =scanner.nextInt();

            if(choice == 13){
                break;
            }
            double num1=0;
            double num2=0;

            if(choice >=1 && choice <= 4){
                num1= Console.getDoubleInput("Enter first number here :");
                num2= Console.getDoubleInput("Enter second number here :");

            }
            Science science = new Science();
            switch(choice){
                case 1:
                    System.out.println("Result:" + science.addition(num1, num2));
                    break;
            }
        }
    }
}

