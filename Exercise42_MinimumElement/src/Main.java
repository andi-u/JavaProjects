import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter the number of elements: ");
        int numberRead = readInteger();
        System.out.println(numberRead);

        System.out.println("Please enter the " + numberRead + " elements of the array");
        int[] readedArray = readElements(numberRead);

        System.out.print("The array is: [");
        for(int i = 0; i < numberRead-1; i++){
            System.out.print(readedArray[i] + ", ");
        }
        System.out.print(readedArray[numberRead-1] + "]");

        System.out.println();
        System.out.println("The minimum element is: " + findMin(readedArray));

    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int noOfElements;
        noOfElements = scanner.nextInt();

        return noOfElements;
    }

    private static int[] readElements(int elements){
        Scanner scanner = new Scanner(System.in);
        int[] elementsArray  = new int[elements];
        for(int i = 0; i < elements; i++){
            elementsArray[i] = scanner.nextInt();
        }
        scanner.close();
        return elementsArray;
    }

    private static int findMin(int[] inpArray){
        int firstElem = inpArray[0];
        for(int i = 1; i < inpArray.length; i++){
            if(inpArray[i] < firstElem){
                firstElem = inpArray[i];
            }
        }
        return firstElem;
    }
}

/*
Write a method called readInteger() that has no parameters and returns an int.

It needs to read in an integer from the user - this represents how many elements the user needs to enter.

Write another method called readElements() that has one parameter of type int

The method needs to read from the console until all the elements are entered, and then return an array
containing the elements entered.

And finally, write a method called findMin() with one parameter of type int[]. The method needs to return
the minimum value in the array.

The scenario is:
1. readInteger() is called.
2. The number returned by readInteger() is then used to call readElements().
3. The array returned from readElements() is used to call findMin().
4. findMin() returns the minimum number.

TIP: Assume that the user will only enter numbers, never letters.
TIP: Instantiate (create) the Scanner object inside the method. There are two scanner objects,
    one for each of the two methods that are reading in input from the user.
TIP: Be extremely careful about spaces in the printed message.

NOTE: All methods should be defined as private static.
NOTE: Do not add a main method to the solution code.

 */
