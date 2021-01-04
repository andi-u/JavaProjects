package com.andi;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int rawSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int rawSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.rawSlots = rawSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRawSlots() {
        return rawSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }
}
