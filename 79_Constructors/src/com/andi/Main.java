package com.andi;

public class Main {

    public static void main(String[] args) {
        VipCustomer tavi = new VipCustomer("Tavi Unguroiu", 56789, "tavi@gmail.com");
        System.out.println("name " + tavi.getName() + " credit limit " + tavi.getCreditLimit() + " emailAddress " + tavi.getEmailAddress());
        System.out.println();
        VipCustomer florin = new VipCustomer("Florin Unguroiu", 30100);
        System.out.println("name " + florin.getName() + " credit limit " + florin.getCreditLimit() + " emailAddress " + florin.getEmailAddress());
        System.out.println();
        VipCustomer paul = new VipCustomer();
        System.out.println("name " + paul.getName() + " credit limit " + paul.getCreditLimit() + " emailAddress " + paul.getEmailAddress());
    }
}

// Create a new class VipCustomer
// it should have 3 fields name, credit limit, and email address.
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this using code generation of intellij as setters wont be needed
// test and confirm it works.
