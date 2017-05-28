package com.ahsanburney;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Tim",500);
        System.out.println("New Score is "+newScore);
        calculateScore(75);
        calculateScore();

        double feet=calcFeetAndInchesToCentimeters(12);

        System.out.println(calcFeetAndInchesToCentimeters(8,4));

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored" + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("UnNamed player scored " +score+" points");
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No player name, no player score. ");
        return 0;
    }


    public static double calcFeetAndInchesToCentimeters(double feet, int inches){
        if(feet >= 0 && inches >= 0 && inches <=12){
            return feet * (12 * 2.54) + inches * 2.54;
        }else{
            System.out.println("Invalid feet and inches");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        } else {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + "inches");
            return calcFeetAndInchesToCentimeters(feet, (int) remainingInches);

        }

    }

}
