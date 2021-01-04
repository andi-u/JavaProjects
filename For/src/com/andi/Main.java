package com.andi;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));


        for(int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i))  );
        }

        // how would you modify the for loop above to do the same thing as
        // shown but to strart from 8% and work back to 2%?
        for(int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " +  String.format("%.2f", calculateInterest(10000, i)));
        }

        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit
        int firstNumber = 10;
        int secondNumber = 20;
        int count = 0;
        for(int i = firstNumber; i <= secondNumber; i++) {
           if(isPrime(i)) {
               System.out.println("Number " + i + " is prime");
               count++;
               if(count == 3) {
                   break;
               }
           }
        }

        /*Create a for statement using a range of numbers from 1 to 1000 inclusive.
        Sum all the numbers that can be divided with both 3 and also with 5.
        For those numbers that met the above conditions, print out the number.
        break out of the loop once you find 5 numbers that met the above conditions.
        After breaking out of the loop print the sum of the numbers that met the above conditions.
                Note: Type all code in main method*/
        int total = 0;
        int count1 = 0;
        for(int i = 1; i <= 1000; i++) {
            if(i%(3*5) == 0) {
                count1++;
                total += i;
                System.out.println("Number " + i + " can be divided with both 3 and 5");
                if(count1 == 5) {
                    System.out.println("Total is " + total);
                    break;
                }
            }
        }



    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int number) {
        if(number == 1) {
            return false;
        }
        for(int i = 2; i <= (long)Math.sqrt(number); i++) {
            if(number%i == 0) {
                return false;
            }
        }
        return true;
    }
}
