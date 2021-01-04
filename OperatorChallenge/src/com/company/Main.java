package com.company;

public class Main {

    public static void main(String[] args) {
        double var1 = 20.0;
        double var2 = 80.0;
        double var3;
        var3 = (var1 + var2) * 100.0;

        double var4;
        var4 = var3 % 40.0;

        boolean var5 = (var4 == 0.0) ? true : false;
        System.out.println("The boolean variable var5 is " + var5);
		if(!var5) {
			System.out.println("Got some remainder");
		}
    }


}
