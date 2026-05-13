package q11;

import java.util.Random;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        int guess;

        System.out.println("Guess the number between 1 and 100!");
        do {
            System.out.print("Your guess: ");
            guess = scanner.nextInt();
            if (guess < target)
                System.out.println("Too low! Try higher.");
            else if (guess > target)
                System.out.println("Too high! Try lower.");
            else
                System.out.println("Correct! The number was " + target);
        } while (guess != target);
    }
}
