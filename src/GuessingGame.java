import java.util.Random;
import java.util.Scanner;

/*
This program will use a while loop to allow the user to guess a number
The output should tell the user to high, to low, or you got it
The user will be allowed 10 attempts
 */
public class GuessingGame {
    public static void main(String [] args){
     //Set up the variables
        Scanner kybd = new Scanner(System.in);
        Random number = new Random();
        int userNumber, loopCtr = 1;
        int min = 1, max = 100;
        int randomNumber = number.nextInt((max - min) + 1) + min;
        boolean guess = false;

        // ask the user to guess a number from 1 to 10
        System.out.println("I am thinking of a number between 1 and 100...");
        System.out.println("Can you guess it?");
        userNumber = kybd.nextInt();


        while (userNumber != randomNumber){
            while (loopCtr < 10) { //Limit 10 attempts
                if (userNumber > randomNumber)
                    System.out.println("That's too high. Guess again");
                else if (userNumber < randomNumber)
                    System.out.println("That's too low. Guess again");
                userNumber = kybd.nextInt();
                if (userNumber == randomNumber) {
                    loopCtr = 11; //Force an end to the inner loop
                    guess = true;
                }
                loopCtr += 1;
                if (loopCtr == 10)
                    userNumber = randomNumber; //Force an end to the outer loop
            }
        }

        if (guess)
            System.out.println("That's right! You are a good guesser.");
        else {
            System.out.println("You didn't get the number after 10 guesses");
            System.out.println("The number was: " + randomNumber);
            }
    }
}
