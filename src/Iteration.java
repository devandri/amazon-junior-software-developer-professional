import java.util.Scanner;

public class Iteration {
    public static void main(String[] str) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 7;
        int userGuess = 0;

        while (userGuess != secretNumber) {
            System.out.print("Guess the number from 1 to 9: ");
            userGuess = scanner.nextInt();

            if (userGuess != secretNumber) {
                System.out.println("Wrong user guess, please try again");
            }
        }

        System.out.println("Congratulations! you guessed the correct number.");
        scanner.close();

    }
}
