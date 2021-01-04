package com.andi;

public class Gearbox {
    private boolean clutchIsIn;

    public void operateClutch(String inOrOut){
        this.clutchIsIn = inOrOut.equalsIgnoreCase("in");
    }
//    public void operateClutch(boolean inOrOut){
//        this.clutchIsIn = inOrOut;
//    }


}
