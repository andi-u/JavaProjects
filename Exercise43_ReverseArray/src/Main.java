import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the length of the array: ");
        int arrayLength = scanner.nextInt();

        System.out.println("Please enter the elements of the array: ");
        int[] enteredArray = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++){
            enteredArray[i] = scanner.nextInt();
        }
        scanner.close();

        reverse(enteredArray);
    }

    private static void reverse(int[] inpArray){
        System.out.print("Array = [");
        for(int i = 0; i < inpArray.length - 1; i++){
            System.out.print(inpArray[i] + ", ");
        }
        System.out.print(inpArray[inpArray.length - 1] + "]");
        System.out.println();

        int middle = (int)(inpArray.length/2);
        int tempElem;
        for(int i = 0; i < middle; i++){
            tempElem = inpArray[i];
            inpArray[i] = inpArray[inpArray.length - 1 - i];
            inpArray[inpArray.length - 1 - i] = tempElem;
        }

        System.out.print("Reversed array = [");
        for(int i = 0; i < inpArray.length - 1; i++){
            System.out.print(inpArray[i] + ", ");
        }
        System.out.print(inpArray[inpArray.length - 1] + "]");
        System.out.println();

    }
}

/*
Write a method called reverse() with an int array as a parameter.

The method should not return any value. In other words, the method is allowed to modify the array parameter.
To reverse the array, you have to swap the elements, so that the first element is swapped with the last
element and so on.

For example, if the array is [1, 2, 3, 4, 5], then the reversed array is [5, 4, 3, 2, 1].
The method should first print out the newly passed in array as Array = [1, 2, 3, 4, 5]

and then once it's been reversed, print it out as Reversed array = [5, 4, 3, 2, 1]

TIP: When swapping the elements, use a variable to temporarily hold the current element.
NOTE: The method should be defined as private static.
NOTE: Do not add a main method to the solution code.
 */
