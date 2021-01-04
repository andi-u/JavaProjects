package com.andi;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count;
        System.out.println("Enter the numer of elements of the array: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            count = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)
            int[] inputArray = readIntegers(count);
            printArray(inputArray);
            int minElem = findMin(inputArray);
            System.out.println("Minimum element of the array is: " + minElem);
        } else {
            System.out.println("The number of elements you entered is not valid");
        }

	    scanner.close();
    }

    private static int[] readIntegers(int count){
        System.out.println("Enter " + count + " elements of the array: ");
        int[] intArray = new int[count];
        for(int i = 0; i < intArray.length; i++){
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                System.out.print("Element " + i + " is: ");
                intArray[i] = scanner.nextInt();
                System.out.print(intArray[i]);
                System.out.println();
                scanner.nextLine(); // handle next line character (enter key)
            } else{
                System.out.println("You have to re-enter the element " + i);
                i--;
                System.out.println();
                scanner.nextLine(); // handle next line character (enter key)
            }
        }
        return intArray;
    }

    private static void printArray(int[] array){
        System.out.print("The entered array is: [");
        for(int i = 0; i < array.length; i++){
            if(i < array.length - 1){
                System.out.print(array[i] + ", ");
            } else if(i == array.length - 1) {
                System.out.println(array[i] + "]");
            }
        }
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

/*
-Write a method called readIntegers() with a parameter called count that represents how many integers the user
needs to enter.
-The method needs to read from the console until all the numbers are entered, and then return an array containing
the numbers entered.
-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the
array.
-In the main() method read the count from the console and call the method readIntegers() with the count
parameter.
-Then call the findMin() method passing the array returned from the call to the readIntegers() method.
-Finally, print the minimum element in the array.

Tips:
	-Assume that the user will only enter numbers, never letters
	-For simplicity, create a Scanner as a static field to help with data input
	-Create a new console project with the name eMinElementChallengef
 */
