
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] getIntegers(int arrSize) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[arrSize];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }
        scanner.close();
        return intArray;
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }

    public static int[] sortArray(int[] arr){
        int[] sortedArray = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            sortedArray[i] = arr[i];
        }
        Arrays.sort(sortedArray);

        int middle = (int)arr.length/2;
        int index = 0;
        int element;
        while(index + 1 <= middle){
            element = sortedArray[index];
            sortedArray[index] = sortedArray[sortedArray.length -1 - index];
            sortedArray[sortedArray.length -1 - index] = element;
            index++;
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        int[] myArray = getIntegers(5);

        int[] sortedArray = sortArray(myArray);
        printArray(sortedArray);

        System.out.println();
        printArray(myArray);
    }
}

/*
Create a program using arrays that sorts a list of integers in descending order.
Descending order is highest value to lowest.
In other words if the array had the values in it [106, 26, 81, 5, 15] your program should ultimately
have an array with [106, 81, 26, 15, 5] in it.
Set up the program so that the numbers to sort are read in from the keyboard (Scanner).

Implement the following methods:
getIntegers has one parameter of type int which is the size of the array. It returns an array of
entered integers from the keyboard.

printArray accepts an array and prints out the contents of the array. It should be printed in the
following format:
Element 0 contents 106
Element 1 contents 81
Element 2 contents 26
Element 3 contents 15
Element 4 contents 5

sortIntegers accepts the unsorted array. It should sort the array and return a new array containing the
sorted numbers.

The scenario is:
1. getIntegers() is called.
2. The returned array from getIntegers() is then used to call sortIntegers().
3. The returned array from sortIntegers() is then printed to the console.
[Do not try and implement this. It is to give you an idea of how the methods will be used]

TIP: you will have to figure out how to copy the array elements from the passed array into a new array
and sort them and return the new sorted array.
TIP: Instantiate (create) the Scanner object inside the method.
TIP: Be extremely careful about spaces in the printed message.

NOTE: All methods should be defined as public static NOT public.

NOTE: Do not add a main method to the solution code.
 */
