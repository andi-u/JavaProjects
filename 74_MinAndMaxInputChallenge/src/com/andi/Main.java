package com.andi;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        //int min = Integer.MAX_VALUE;
        //int max = Integer.MIN_VALUE;
        boolean first = true;

        while(true){
            System.out.print("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int newNumber = scanner.nextInt();
                if(first) {
                    min = newNumber;
                    max = newNumber;
                    first = false;
                }
                if(newNumber <= min) {
                    min = newNumber;
                }
                if(newNumber >= max) {
                    max = newNumber;
                }
            } else{
                System.out.println("Invalid number.");
                break;
            }
            scanner.nextLine(); // handle next line character (enter key)
        }
        System.out.println("min = " + min + ", max = " + max);
        scanner.close();
    }
}

/*
-Read the numbers from the console entered by the user and print the minimum and maximum number the user
has entered.
-Before the user enters the number, print the message gEnter number:h
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

Hint:
-Use an endless while loop.

Bonus:
-Create a project with the name MinAndMaxInputChallenge.
 */