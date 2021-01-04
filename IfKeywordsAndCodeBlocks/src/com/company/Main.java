package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 2000;
        int levelCompleted = 5;
        int bonus = 100;
//        if(score < 5000 && score > 1000){
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if(score < 1000){
//            System.out.println("Your score was less than 1000");
//        } else{
//            System.out.println("Got here");
//        }

            if(gameOver == true){
                int finalScore = score + (bonus * levelCompleted);
                System.out.println("Your final score was " + finalScore);
                score = 10000;
                levelCompleted = 8;
                bonus = 200;
                finalScore = score + (bonus * levelCompleted);
                System.out.println("Your final score was " + finalScore);
            }

            //int savedFinalScore = finalScore; // this will be an error, because al  variables created inside
            //of an code blocks will be deleted outside of the code blocks (e.g. finalScore)


        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well


    }
}
