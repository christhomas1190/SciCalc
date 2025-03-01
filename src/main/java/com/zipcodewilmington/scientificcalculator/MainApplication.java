package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import java.math.BigInteger;
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to my scientific calculator");
        Scanner scanner = new Scanner(System.in);
        double memory = 0;


        while (true) {   //SwitchDisplayMode(String mode) = allow user to type operation/menu options in
            System.out.println(" Choose an operation");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Square");
            System.out.println("6: Square root");
            System.out.println("7: Sine");
            System.out.println("8: Cosine");
            System.out.println("8: Tangent");
            System.out.println("9: Inverse Sine");
            System.out.println("10: Inverse Cosine");
            System.out.println("13: Quit application");
                        //SwitchDisplayMode() = create multiple display menus instead of one large one?

            int choice = scanner.nextInt(); //Close scanner when all inputs are built

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
//System.out.print(memory);
//break

//memory = Science.storeMemory(memory, num1);
//System.out.println("Current value is " + memory );
//break;

//memory = Science.resetMemory(memory);
//System.out.println("Memory has been reset
//break;

//num1 = Science.recallMemory(num1, memory);
//System.out.println("Memory is now set to " + num1);
//break;