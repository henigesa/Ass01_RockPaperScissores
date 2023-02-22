
/*
Name: Sabrina Henige
Assignment: 01_RockPaperScissorsGame
Class: IT1090C
Prof: Andy Zimmerman
Description & Function:
This program is a game that can be played by one or two users.
The first game mode is a game of rock paper scissors where one person inputs one move,
and then a second person inputs their move.
The second game mode is a game of rock paper scissors where the computer randomly
generates a play and the user inputs a play to essentially play rock paper scissors
against a computer that is bad at rock paper scissors. The main class can be
cleaned up by splitting the two game types into two classes. I would like to
go back and do that when I learn how.
To run this program, the user must enter
1. their choice of gameplay
2. their choice of rock, paper, or scissors
3. and whether they choose to continue playing
 */

import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        //declare variables
        String userInput = new String ("p");
        String twoUserInput = new String ("p");
        String computer = new String ("p");
        int randomNum;
        int check;
        int playMode;
        int quitOrStay = 1;
        //prompt user to choose two-player or computer
        System.out.println("Welcome to Rock-Paper-Scissors. If you are playing with a partner, input '1'. If you wish to play a computer, input '2'");
        playMode = input.nextInt();
        if (playMode == 1) {
            while (quitOrStay == 1) {
                System.out.println("Player 1, please input an 'R' for rock, a 'P' for paper, or 'S' for scissors.");
                //take the user input
                userInput = input.next();
                //check if the user input is correct
                if (userInput.equalsIgnoreCase("R") || userInput.equalsIgnoreCase("P") || userInput.equalsIgnoreCase("S")) {
                    check = 1;
                } else {
                    check = 2;
                }
                //enter loop until user gets it right if wrong
                while (check == 2) {
                    System.out.println("Sorry, you did not enter a valid input. Either enter R, P, or S. Try again.");
                    userInput = input.next();
                    //check if need to continue while loop
                    if (userInput.equalsIgnoreCase("R") || userInput.equalsIgnoreCase("P") || userInput.equalsIgnoreCase("S")) {
                        check = 1;
                    } else {
                        check = 2;
                    }
                }
                //now do the same thing for player two's input
                System.out.println("Player 2, please input an 'R' for rock, a 'P' for paper, or 'S' for scissors.");
                //take the user input
                twoUserInput = input.next();
                //check if the user input is correct
                if (twoUserInput.equalsIgnoreCase("R") || twoUserInput.equalsIgnoreCase("P") || twoUserInput.equalsIgnoreCase("S")) {
                    check = 1;
                } else {
                    check = 2;
                }
                //enter loop until user gets it right if wrong
                while (check == 2) {
                    System.out.println("Sorry, you did not enter a valid input. Either enter R, P, or S. Try again.");
                    twoUserInput = input.next();
                    //check if need to continue while loop
                    if (twoUserInput.equalsIgnoreCase("R") || twoUserInput.equalsIgnoreCase("P") || twoUserInput.equalsIgnoreCase("S")) {
                        check = 1;
                    } else {
                        check = 2;
                    }
                }
                //reveal both choices to the user
                System.out.println("Player 1 chose " + userInput + ".");
                System.out.println("Player 2 chose " + twoUserInput + ".");
                //if logic to decide who won and appropriate output
                if (userInput.equalsIgnoreCase(twoUserInput)) {
                    System.out.println("You both chose the same play. It’s a tie!");
                }
                if (twoUserInput.equalsIgnoreCase("R") & userInput.equalsIgnoreCase("S")) {
                    System.out.println("Rock crushes scissors. Player 2 wins!");
                }
                if (twoUserInput.equalsIgnoreCase("R") & userInput.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers rock. Player 1 wins!");
                }
                if (twoUserInput.equalsIgnoreCase("P") & userInput.equalsIgnoreCase("S")) {
                    System.out.println("Scissors cut paper. Player 1 wins!");
                }
                if (twoUserInput.equalsIgnoreCase("P") & userInput.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers rock. Player 2 wins!");
                }
                if (twoUserInput.equalsIgnoreCase("S") & userInput.equalsIgnoreCase("R")) {
                    System.out.println("Rock crushes scissors. Player 1 wins!");
                }
                if (twoUserInput.equalsIgnoreCase("S") & userInput.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cut paper. Player 2 wins!");
                }
                //ask if they would like to play again
                System.out.println("Enter 1 if you would like to play again. Enter 2 if you are a quitter.");
                quitOrStay = input.nextInt();
                //end while loop
            }
            // end two-player mode
        }
        if (playMode == 2) {
            while (quitOrStay == 1) {
                System.out.println("Please input an 'R' for rock, a 'P' for paper, or 'S' for scissors.");
                //take the user input
                userInput = input.next();
                //check if the user input is correct
                if (userInput.equalsIgnoreCase("R") || userInput.equalsIgnoreCase("P") || userInput.equalsIgnoreCase("S")) {
                    check = 1;
                } else {
                    check = 2;
                }
                //enter loop until user gets it right if wrong
                while (check == 2) {
                    System.out.println("Sorry, you did not enter a valid input. Either enter R, P, or S. Try again.");
                    userInput = input.next();

                    if (userInput.equalsIgnoreCase("R") || userInput.equalsIgnoreCase("P") || userInput.equalsIgnoreCase("S")) {
                        check = 1;
                    } else {
                        check = 2;
                    }
                }
                //generate random number
                randomNum = generator.nextInt(3) + 1;
                //assign random number to r, p, or s using if
                if (randomNum == 1) {
                    computer = ("R");
                }
                if (randomNum == 2) {
                    computer = ("P");
                }
                if (randomNum == 3) {
                    computer = ("S");
                }
                //reveal both choices to the user
                System.out.println("You chose " + userInput + ".");
                System.out.println("I chose " + computer + ".");
                //if logic to decide who won and appropriate output
                if (userInput.equalsIgnoreCase(computer)) {
                    System.out.println("We chose the same play. It’s a tie!");
                }
                if (computer.equals("R") & userInput.equalsIgnoreCase("S")) {
                    System.out.println("Rock crushes scissors. I win!");
                }
                if (computer.equals("R") & userInput.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers rock. You win!");
                }
                if (computer.equals("P") & userInput.equalsIgnoreCase("S")) {
                    System.out.println("Scissors cut paper. You win!");
                }
                if (computer.equals("P") & userInput.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers rock. I win!");
                }
                if (computer.equals("S") & userInput.equalsIgnoreCase("R")) {
                    System.out.println("Rock crushes scissors. You win!");
                }
                if (computer.equals("S") & userInput.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cut paper. I win!");
                }
                //ask if they would like to play again
                System.out.println("Enter 1 if you would like to play again. Enter 2 if you are a quitter.");
                quitOrStay = input.nextInt();
                        //end while loop
            }
            // end computer play mode
        }
    }
}