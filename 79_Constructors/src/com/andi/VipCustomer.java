package com.andi;

public class VipCustomer {
    // Fields:
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Paul Husarciuc", 50000, "paul@gmail.com");
        System.out.println("1st constructor");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "florin@gmail.com");
        System.out.println("2nd constructor");
    }


    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;

        System.out.println("3rd constructor");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
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
