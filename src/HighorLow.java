import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        // Generates random int between 1 and 10 inclusive
        int targetNumber = generator.nextInt(10) + 1;
        int userGuess = 0;
        String trash = "";
        boolean done = false;

        // Bulletproof input loop: must be an int from 1 to 10
        do {
            System.out.print("Guess the number (1-10): ");
            if (in.hasNextInt()) {
                userGuess = in.nextInt();
                in.nextLine(); // Clear buffer
                if (userGuess >= 1 && userGuess <= 10) {
                    done = true;
                } else {
                    System.out.println("Out of range! Guess must be between 1 and 10 inclusive.\n");
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You have to enter a valid whole number!\n");
            }
        } while (!done);

        // Display results
        System.out.println("\nThe random number was: " + targetNumber);
        if (userGuess < targetNumber) {
            System.out.println("Your guess was too low!");
        } else if (userGuess > targetNumber) {
            System.out.println("Your guess was too high!");
        } else {
            System.out.println("Your guess was on the money!");
        }

        in.close();
    }
}