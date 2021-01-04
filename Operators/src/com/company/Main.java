package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10
        result *= 10; // 3 * 10 = 10
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result -2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }
        int topScore = 100;
        if (topScore != 100) {
            System.out.println("You got the high score!");
        }
        if (topScore > 100) {
            System.out.println("You got the high score!");
        }
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 101)){
            System.out.println("Greater than second top score AND less than 101");
        }
        if((topScore > secondTopScore) || (topScore < 100)){
            System.out.println("Greater than second top score OR less than 100");
        }
        // Difference between the assignement and equal to operators
        int newValue = 50;
//        if(newValue = 50) {
//            System.out.println("This is an error");
//        }
        if(newValue == 50) {
            System.out.println("This is not an error");
        }
        boolean isCar = false;
        if(isCar = true){
            System.out.println("1 - This is not supposed to happen");
        }
        if(isCar == true){
            System.out.println("isCar = " + isCar);
            System.out.println("2 - This is true");
        }
        if(isCar){
            System.out.println("3 - This is true");
        }
        if(!isCar){
            System.out.println("4 - This is true");
        }

        // TERNARY OPERATOR
        boolean isCar1 = true;

        boolean wasCar = isCar1 ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }

    }


}
