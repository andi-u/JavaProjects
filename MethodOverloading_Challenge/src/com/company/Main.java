package com.company;

public class Main {

    public static void main(String[] args) {

        // Create a method called calcFeetAndInchesToCentimeters
        // It needs to have two parameters.
        // feet is the first parameter, inches is the 2nd parameter
        //
        // You should validate that the first parameter feet is >= 0
        // You should validate that the 2nd parameter inches is >=0 and <=12
        // return -1 from the method if either of the above is not true
        //
        // If the parameters are valid, then calculate how many centimetres
        // comprise the feet and inches passed to this method and return
        // that value.
        //
        // Create a 2nd method of the same name but with only one parameter
        // inches is the parameter
        // validate that its >=0
        // return -1 if it is not true
        // But if its valid, then calculate how many feet are in the inches
        // and then here is the tricky part
        // call the other overloaded method passing the correct feet and inches
        // calculated so that it can calculate correctly.
        // hints: Use double for your number datatypes is probably a good idea
        // 1 inch = 2.54cm  and one foot = 12 inches
        // use the link I give you to confirm your code is calculating correctly.
        // Calling another overloaded method just requires you to use the
        // right number of parameters.
        calcFeetAndInchesToCentimeters(1, 0);
        calcFeetAndInchesToCentimeters(0, 1);
        calcFeetAndInchesToCentimeters(1, 1);
        calcFeetAndInchesToCentimeters(-10,1);
        calcFeetAndInchesToCentimeters(1);
        calcFeetAndInchesToCentimeters(6);
        calcFeetAndInchesToCentimeters(13);
        calcFeetAndInchesToCentimeters(-4);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double result = -1;
        if((feet >= 0) && (inches >= 0) && (inches <= 12)) {
            result = feet*12*2.54 + inches*2.54;
            System.out.println(feet + " feet + " + inches + " inches = " + result + " cm");
        }
        else {
            System.out.println("Invalid feet or inches parameters.");
        }
        return result;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double result = -1;
        if(inches >= 0) {
            double feetCalc, inchesRem;
            // feetCalc = Math.floor(inches/12);
            feetCalc = (int)inches/12;
            inchesRem = (int)inches%12;
            result = calcFeetAndInchesToCentimeters(feetCalc, inchesRem);
        }
        else {
            System.out.println("Invalid inches parameter.");
        }
        return result;
    }
}
