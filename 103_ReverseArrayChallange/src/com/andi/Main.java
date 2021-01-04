package com.andi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an array with following number of elements: ");
        int count;

        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            count = scanner.nextInt();
            int[] inputArray = new int[count];
            scanner.nextLine();  // handle next line character (enter key)

            for(int i = 0; i < inputArray.length; i++) {
                System.out.println("Element " + i + " is: ");
                hasNextInt = scanner.hasNextInt();
                if(hasNextInt){
                    inputArray[i] = scanner.nextInt();
                    scanner.nextLine();
                } else{
                    System.out.println("Enter again the element " + i);
                    i--;
                    scanner.nextLine();
                }
            }
            System.out.print("Entered array is: ");
            //printArray(inputArray);
            System.out.println(Arrays.toString(inputArray));
            System.out.println();

            // reversing array:
            reverseIterative(inputArray);
            System.out.print("Reversed array is: ");
            printArray(inputArray);

            System.out.println();
            reverseRecursive(inputArray);
            System.out.print("Reversed array is: ");
            printArray(inputArray);

        } else{
            System.out.println("You did't entered a valid number of elements!");
        }


        scanner.close();
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length; i++) {
            if(i < array.length - 1){
                System.out.print(array[i] + ", ");
            } else{
                System.out.print(array[i] + "]");
            }
        }
    }

    private static void reverseIterative(int[] array) {
        int firstIndex = 0;
        int secondIndex = array.length-1;
        int temp;
        //int index = (int)Math.floor((double)array.length/2);
        int index = array.length/2;
        while(index > 0) {
            // swap
            temp = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = temp;

            firstIndex++;
            secondIndex--;
            index--;
        }
    }

    private static void reverseRecursive(int[] array) {
        int[] newArray = helper(array);
        for(int i=0; i < array.length; i++){
            array[i] = newArray[i];
        }
    }
    private static int[] helper(int[] array) {
        if(array.length == 1) {
            return array;
        } else{
            return insertElem(array[array.length-1], helper(Arrays.copyOf(array, array.length-1)));
        }
    }

    private static int[] insertElem(int elem, int[] array) {
        int[] inpArray = new int[array.length + 1];
        for(int i = 0; i < array.length; i++){
            inpArray[1 + i] = array[i];
        }
        inpArray[0] = elem;
        return inpArray;
    }




}

/*
-Write a method called reverse() with an int array as a parameter.
-The method should not return any value. In other words, the method is allowed to modify the array parameter.
-In main() test the reverse() method and print the array both reversed and non-reversed.
-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element
and so on.
-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.

Tip:
	-Create a new console project with the name eReverseArrayChallengef
 */
