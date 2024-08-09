   import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        int rounds = 1;
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 6;

            System.out.println("Round " + rounds);
            System.out.println("Guess a number between 1 and 100:");

            while (attempts < maxAttempts) {
                int guess = input.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("You win! The number was " + numberToGuess);
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Your guess is too low. Attempts left: " + (maxAttempts - attempts));
                } else {
                    System.out.println("Your guess is too high. Attempts left: " + (maxAttempts - attempts));
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("You lose! The number was " + numberToGuess);
            }

            System.out.println("Do you want to play again? (yes/no)");
            String response = input.next();

            if (response.equalsIgnoreCase("no")) {
                playAgain = false;
            }

            rounds++;
        }

        input.close();
    }

}
