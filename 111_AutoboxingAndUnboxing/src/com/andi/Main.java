package com.andi;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        // ArrayList<int> intArrayList = new ArrayList<int>(); // error
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++){
            integerArrayList.add(Integer.valueOf(i)); // this represents autoboxing
        }

        for(int i=0; i<=10; i++){
            System.out.println(i + ": " + integerArrayList.get(i).intValue()); // this represents unboxing
        }

        Integer myIntValue = 56; // Integer.valueOf(56)
        int myInt = myIntValue; // myIntValue.intValue()

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5){
            myDoubleValues.add(dbl);

        }

        for(int i = 0; i < myDoubleValues.size(); i++){
            System.out.println(i + ": " + myDoubleValues.get(i));
        }


    }
}
