package com.andi;

public class Main {

    public static void main(String[] args) {

        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not.
        // return true if an even number, otherwise return false;

        int number = 4;
        int finishNumber = 20;
//        while(number <= finishNumber){
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("Even number: " + number);
//        }

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        int count = 0;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            count++;
            System.out.println("Even number: " + number);
            if(count == 5){
                System.out.println("Total number of even numbers found is " + count);
                break;
            }
        }

        // do while version
        System.out.println("Do While version:");
        int number1 = 4;
        int finishNumber1 = 20;
        int evenNumbersFound = 0;

        do{
            number1++;
            if(!isEvenNumber(number1)) {
                continue;
            }
            System.out.println("Even number: " + number1);
            evenNumbersFound++;
            if(evenNumbersFound >= 5){
                break;
            }
        }
        while(number1 <= finishNumber1);
        System.out.println("Total number of even numbers is: " + evenNumbersFound);

    }

    public static boolean isEvenNumber(int parameter1){
        boolean result = false;

        if(parameter1%2 == 0){
            result = true;
        }

        return result;
    }
}
