package com.andi;

public class Main {

    public static void main(String[] args) {
	    BankAccount myAccount = new BankAccount();
	    myAccount.setBalance(1000);
	    myAccount.setAccountNumber("2345RTE2341GH032");
	    myAccount.setCustomerName("Andi Unguroiu");
	    myAccount.setEmail("andi@andi.com");
	    myAccount.setPhoneNumber("78923145");
	    myAccount.depositFunds(345);
        System.out.println(myAccount.getBalance());
        myAccount.withdrawFunds(200);
        System.out.println(myAccount.getBalance());
        myAccount.withdrawFunds(1500);
        System.out.println(myAccount.getBalance());

        BankAccount anotherAccount = new BankAccount("12345", 456, "Paul Husarciuc", "paul@paul.com", "450934567");
        anotherAccount.depositFunds(35);
        System.out.println(anotherAccount.getBalance());
        anotherAccount.withdrawFunds(22);
        System.out.println(anotherAccount.getBalance());

        BankAccount florinsAccount = new BankAccount("Florin Unguroiu", "florin@florin.com", "560999234");
        System.out.println(florinsAccount.getCustomerName());
        System.out.println(florinsAccount.getEmail());
        System.out.println(florinsAccount.getPhoneNumber());

    }
}

/*
    // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number.
    //
    // Create getters and setters for each field
    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) to
    // confirm your code is working.
    // Add some System.out.println's in the two methods above as well.
 */
