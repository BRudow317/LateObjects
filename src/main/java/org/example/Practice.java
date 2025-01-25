package org.example;
import java.util.Scanner;

public class Practice {
    public static void printFormatMethod() {
        //System.out.println("Show me a new line\nOkay sir");
        System.out.printf("%s%n%s",
                    "string, newline, string",
                    "The first parameter tells the format method how to handle the following parameters."
        );
    }

    public static void addition(){
        Scanner input = new Scanner(System.in);
       System.out.println("Input first number: ");
       int a = input.nextInt();

        System.out.println("Input second number: ");
        int b = input.nextInt();

        int sum = a + b;

        System.out.println(a + " + " + b + " = " + sum);
    }

    public static void printStars() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many stars to start? ");
        int a = input.nextInt();
        int i = a;
        while ( i != 0 ) {
            int h = 1;
            //System.out.print(i);
            while ( h <= i ) {
                System.out.print("*");
                h = h+1;
            }
            System.out.print("\n");
            i = i-1;
        }
    }

    public static void ifElseMethods() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a = input.nextInt();
        if(a <= 10) {
            System.out.println("10 or less");
        }
        else {
            System.out.println("More than 10");
        }

        //These if/else statements in Java can be rewritten with ? and :
        System.out.println("Enter another number:");
        int b = input.nextInt();
        System.out.println(b<=10?"10 or less":"More than 10");
    }
}