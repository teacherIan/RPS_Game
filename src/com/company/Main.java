package com.company;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static int gamesWon = 0;
    static int gamesLost = 0;
    static int gamesTied = 0;
    static int gamesPlayed;

    public static void main(String[] args) {
        System.out.println("Hello");
        viewRules();

    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please pick, or press 4 to see the menu:");
        int userInput = scanner.nextInt();

        if(userInput == 1) {
            userPickedOne();
        }
        if(userInput == 2) {
            userPickedTwo();
        }
        if(userInput == 3) {
            userPickedThree();
        }
        if(userInput == 4) {
            viewRules();
        }
        if(userInput == 5) {
            viewScores();
        }
        if(userInput == 6) {
            System.out.println("Goodbye");
        }
    }

    public static void userPickedOne() {
        int AI = getAI();
        if(AI == 1) {
            System.out.println("You picked rock, and the computer also picked Rock, you tied");
            gamesTied++;
        }
        if(AI == 2) {
            System.out.println("You picked rock, and the computer picked paper, you lost");
            gamesLost++;
        }
        if(AI == 3) {
            System.out.println("You picked rock, and the computer picked scissors, you won");
            gamesWon++;
        }
        menu();
    }

    public static void userPickedTwo() {
        int AI = getAI();

        if(AI == 1) {
            System.out.println("You picked paper, and the computer picked rock, you win!");
            gamesWon++;
        }
        if(AI == 2) {
            System.out.println("You picked paper, and the computer picked paper, you tied!");
            gamesTied++;
        }
        if(AI == 3) {
            System.out.println("You picked paper, and the computer picked Scissors, you lose!");
            gamesLost++;
        }
        menu();
    }

    public static void userPickedThree() {
        int AI = getAI();

        if(AI == 1) {
            System.out.println("You choose scissors and the computer choose rock. You lost");
            gamesLost++;
        }
        if(AI == 2) {
            System.out.println("You choose scissors and the computer choose paper.  You win!");
            gamesWon++;
        }
        if(AI == 3) {
            System.out.println("You Choose scissors and the computer choose scissors, you tied");
            gamesTied++;
        }
        menu();
    }

    public static void viewRules() {
        System.out.println("Press 1 to choose Rock");
        System.out.println("Press 2 to choose Paper");
        System.out.println("Press 3 to choose Scissors");
        System.out.println("Press 4 to see the menu");
        System.out.println("Press 5 to see scores");
        System.out.println("Press 6 to exit");
        menu();
    }

    public static int getAI() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    public static void viewScores() {
        gamesPlayed = gamesWon + gamesLost + gamesTied;
        int percentageWon = (int)(((double)gamesWon / (double)gamesPlayed) * 100);
        System.out.println("You have won " + gamesWon + " times");
        System.out.println("You have lost " + gamesLost + " times");
        System.out.println("You have tied " + gamesTied + " times");
        System.out.println("You are winning " + (percentageWon) + "% of games");

        menu();

    }
}
