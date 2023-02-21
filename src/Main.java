
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        //declare variables
        String userInput = new String ("userInput");
        String computer = new String ("computer");
        int randomNum;
        int check;
        //prompt user to input a play
        System.out.println("Welcome to Rock-Paper-Scissors. Please input an 'R' for rock, a 'P' for paper, or 'S' for scissors.");
        //take the user input
        userInput = input.nextLine();
        //check if the user input is correct
        if (userInput.equalsIgnoreCase("R") || userInput.equalsIgnoreCase("P") || userInput.equalsIgnoreCase("S" )) {
            check = 1 ;
        }
        else {
            check = 2 ;
        }
        //enter loop until user gets it right if wrong
        while (check == 2) {
            System.out.println("Sorry, you did not enter a valid input. Either enter R, P, or S. Try again.");
            userInput = input.nextLine();
            if (userInput.equalsIgnoreCase("R") || userInput.equalsIgnoreCase("P") || userInput.equalsIgnoreCase("S" )) {
                check = 1 ;
            }
            else {
                check = 2 ;
            }
        }
        //generate random number
        randomNum = generator.nextInt(3) + 1 ;
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
        if (userInput.equalsIgnoreCase(computer)){
            System.out.println("We chose the same play. It’s a tie!");
        }
        if (computer.equals("R") & userInput.equalsIgnoreCase("S")){
            System.out.println("Rock crushes scissors. I win!");
        }
        if (computer.equals("R") & userInput.equalsIgnoreCase("P")){
            System.out.println("Paper covers rock. You win!");
        }
        if (computer.equals("P") & userInput.equalsIgnoreCase("S")){
            System.out.println("Scissors cut paper. You win!");
        }
        if (computer.equals("P") & userInput.equalsIgnoreCase("R")){
            System.out.println("Paper covers rock. I win!");
        }
        if (computer.equals("S") & userInput.equalsIgnoreCase("R")){
            System.out.println("Rock crushes scissors. You win!");
        }
        if (computer.equals("S") & userInput.equalsIgnoreCase("P")){
            System.out.println("Scissors cut paper. I win!");
        }
    }
}