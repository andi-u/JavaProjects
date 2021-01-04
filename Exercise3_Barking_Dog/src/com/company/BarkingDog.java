package com.company;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean dogIsBarking, int hourOfDay) {
        boolean result = false;
        if(hourOfDay >= 0 && hourOfDay <=23){
            if(dogIsBarking){
                if(hourOfDay >= 8 && hourOfDay <= 22){
                    result = false;
                }
                else {
                    result = true;
                }
            }
            else {
                result = false;
            }
        }
        else{
            result = false;
        }
        return result;
    }
}
