package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
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
            System.out.println("6: Cube/Exponent");
            System.out.println("7: Square root");
            System.out.println("8: Sine");
            System.out.println("9: Cosine");
            System.out.println("10: Tangent");
            System.out.println("11: Inverse Sine");
            System.out.println("12: Inverse Cosine");
            System.out.println("13: Inverse Tangent");
            System.out.println("14: Inverse");
            System.out.println("15: Switch sign");
            System.out.println("16: Factorial");
            System.out.println("17: Degrees");
            System.out.println("18: Radians");
            System.out.println("19: log");
            System.out.println("20: log10");
            System.out.println("21: log1p");
            System.out.println("22: Inverse Natural Log");
            System.out.println("23:Store Memory");
            System.out.println("24:Reset Memory");
            System.out.println("25:Recall Memory");
            System.out.println("26: Quit application");
                        //SwitchDisplayMode() = create multiple display menus instead of one large one?

            int choice = scanner.nextInt(); //Close scanner when all inputs are built

            if(choice == 26){
                break;
            }

            double num1=0;
            double num2=0;

            if(choice >=1 && choice <= 4 || choice ==6 || choice ==25|| choice ==23){
                System.out.println("Enter first number: ");
                num1=scanner.nextDouble();
                System.out.println("Enter second number: ");
                num2=scanner.nextDouble();
            }else if ( choice ==5  || choice ==7 || (choice>8 && choice <=25)){
                num1= Console.getDoubleInput("Enter number here :");
            }


            Science science = new Science();
            switch(choice){
                case 1:
                    System.out.println("Result:" + science.addition(num1, num2));
                    break;

                case 2:
                    System.out.println("Result:" + science.subtraction(num1, num2));
                    break;
                case 3:
                    System.out.println("Result:" + science.multiplication(num1, num2));
                    break;
                case 4:
                    System.out.println("Result:" + science.division(num1, num2));
                    break;
                case 5:
                    System.out.println("Result:" + science.square(num1));
                    break;
                case 6:
                    System.out.println("Result:" + science.pow(num1, num2));
                    break;
                case 7:
                    System.out.println("Result:" + science.squareRt(num1));
                    break;
                case 8:
                    System.out.println("Result:" + science.sin(num1));
                    break;
                case 9:
                    System.out.println("Result:" + science.cos(num1));
                    break;
                case 10:
                    System.out.println("Result:" + science.tan(num1));
                    break;
                case 11:
                    System.out.println("Result:" + science.inverseSin(num1));
                    break;

                case 12:
                System.out.println("Result:" + science.inverseCos(num1));
                    break;
                case 13:
                    System.out.println("Result:" + science.inverseTan(num1));
                    break;

                case 14:
                    System.out.println("Result:" + science.inverse(num1));
                    break;
                case 15:
                    System.out.println("Result:" + science.switchSign(num1));
                    break;
//                case 16:
//                    System.out.println("Result:" + science.factorial(num1);
//                    break;
                case 17:
                    System.out.println("Result:" + science.degrees(num1));
                    break;
                case 18:
                    System.out.println("Result:" + science.radians(num1));
                    break;
                case 19:
                    System.out.println("Result:" + science.log(num1));
                    break;
                case 20:
                    System.out.println("Result:" + science.log10(num1));
                    break;
                case 21:
                    System.out.println("Result:" + science.log1p(num1));
                    break;
                case 22:
                    System.out.println("Result:" + science.inverseNL(num1));
                    break;
                case 23:
                    System.out.println("Result:" + science.storeMemory(num1, num2));
                    break;
                case 24:
                    System.out.println("Result:" + science.resetMemory(num1));
                    break;
                case 25:
                    System.out.println("Result:" + science.recallMemory(num1, num2));
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