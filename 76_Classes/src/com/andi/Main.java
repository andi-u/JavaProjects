package com.andi;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
	    Car holden = new Car();
		//System.out.println("Model is " + porsche.getModel()); // Model is null
	    porsche.setModel("Carrera");
		System.out.println("Model is " + porsche.getModel()); // Model is Carrera
		porsche.setModel("911");
		System.out.println("Model is " + porsche.getModel()); // Model is Unknown
    }
}
