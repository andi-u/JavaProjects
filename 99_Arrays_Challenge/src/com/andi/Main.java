package com.andi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] MyArray = getIntegers(7);
        System.out.println("Initial array is: ");
        printArray(MyArray);

        System.out.println("Sorted array with merge sort is: ");
        int[] sortedMergeArray = sortMergeIntegers(MyArray);
        printArray(sortedMergeArray);

        System.out.println("Initial array is: ");
        printArray(MyArray);

        System.out.println("Sorted array with selection sort is: ");
        int[] sortedSelectionArray = sortSelIntegers(MyArray);
        printArray(sortedSelectionArray);

        System.out.println("Initial array is: ");
        printArray(MyArray);

        scanner.close();
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] intArray = new int[number];
        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    public static void printArray(int[] inpArray) {
        System.out.print("[");

        for (int i = 0; i < inpArray.length; i++) {
            System.out.print(inpArray[i]);
            if (i < inpArray.length - 1) {
                System.out.print(", ");
            } else if (i == inpArray.length - 1) {
                System.out.println("]");
            }
        }
    }

    // Merge sort---------------------------------------------------------------------
    public static int[] mergeArr(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr[index] = arr2[j];
                j++;
            } else{
                arr[index] = arr1[i];
                i++;
            }
            index++;
        }
        while(i < arr1.length){
            arr[index] = arr1[i];
            i++;
            index++;
        }
        while(j < arr2.length){
            arr[index] = arr2[j];
            j++;
            index++;
        }
        return arr;
    }

    // Recursive solution
    public static int[] sortMergeIntegers(int[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int mid = (int)Math.floor((double)arr.length/2);
        int[] left = sortMergeIntegers(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sortMergeIntegers(Arrays.copyOfRange(arr, mid, arr.length));
        return mergeArr(left, right);
    }
    //End Merge Sort------------------------------------------------------------------------------------
    //
    //
    // Selection sort-----------------------------------------------------------------------------
    public static int[] swap2ArrayElem(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }
    public static int[] sortSelIntegers(int[] arr){
//        int[] sortedArr = new int[arr.length];
//        for(int i = 0; i < arr.length; i++) {
//            sortedArr[i] = arr[i];
//        }
        int[] sortedArr = Arrays.copyOf(arr, arr.length);


        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArr.length-1; i++) {
                if(sortedArr[i] < sortedArr[i+1]){
                    sortedArr = swap2ArrayElem(sortedArr, i, i+1);
                    flag = true;
                }
            }
        }
        return sortedArr;
    }
    //End Selection Sort-------------------------------------------------------------------------------
}
// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.