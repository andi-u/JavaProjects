package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // challange
    byte baitulMeu = 10;
    short scurtulMeu = 20;
    int intregulMeu = 50;
    long lungulMeu = 50000L + 10L * (baitulMeu + scurtulMeu + intregulMeu);
    System.out.println(lungulMeu);

    short shortTotal = (short) (1000 + 10 * (baitulMeu + scurtulMeu + intregulMeu));
        System.out.println(shortTotal);
    }
}
