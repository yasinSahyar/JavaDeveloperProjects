package Exercises;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Guess Number Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        // Generate a random target number between 1 and 100
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        // Uncomment the line below if you want to use a fixed number (e.g., 45)
        // int targetNumber = 45;

        Scanner scanner = new Scanner(System.in);
        int guess;

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

        } while (guess != targetNumber);

        scanner.close();
    }
}

