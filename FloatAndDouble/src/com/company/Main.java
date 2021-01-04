package com.company;

public class Main {

    public static void main(String[] args) {
        
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue0 = 5;
        float myFloatValue0 = 5.25f; // alternative is: (float) 5.25
        double myDoubleValue0 = 5.25d; // d is optional

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        double myDoubleValue1 = 5.00 / 3.00;
        double myDoubleValue2= 5 / 3; // you should specify that is double (adding .00)
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);
        System.out.println("MyDoubleValue1= " + myDoubleValue1);
        System.out.println("MyDoubleValue2= " + myDoubleValue2);

        // Challenge
        double numberOfPounds = 200;
        double numberOfKilos = numberOfPounds * 0.45359237;
        System.out.println(numberOfPounds + " lbs represents " + numberOfKilos + " kg");

        double pi = 3.141592654d; // d from the end is not mandatory
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
