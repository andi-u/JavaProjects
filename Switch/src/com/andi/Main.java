package com.andi;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if(value == 1) {
//            System.out.println("The value was 1");
//        }
//        else if(value == 2) {
//            System.out.println("The value was 2");
//        }
//        else{
//            System.out.println("The value was not 1 or 2");
//        }

        int switchValue = 1;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }
        // CHALLENGE
        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char variable = 'D';
        switch(variable) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("was founf A, B, C, D or E");
                System.out.println("Exactly, was found " + variable);
                break;
            default:
                System.out.println("Was not found A, B, C, D or E");
                break;

        }
    }
}
