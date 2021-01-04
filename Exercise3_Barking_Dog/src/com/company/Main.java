package com.company;

public class Main {

    public static void main(String[] args) {
        boolean temporar;
	    temporar = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(temporar);
        temporar = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(temporar);
        temporar = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(temporar);
        temporar = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(temporar);
    }
}
