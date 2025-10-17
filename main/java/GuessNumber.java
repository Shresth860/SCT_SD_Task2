import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1; // Random number between 1 and 100
        Scanner sc = new Scanner(System.in);
        int guess = 0;

        System.out.println(" Think of a number between 1 and 100.");

        // Keep asking until the user guesses correctly
        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");

            // Take input
            guess = sc.nextInt();

            // Compare guess with the number
            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("🎉 Congratulations! You guessed it right!");
            }
        }

        sc.close();
    }
}
