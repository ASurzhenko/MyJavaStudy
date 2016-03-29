
package homeWork9.guessNumber;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Александр on 28.03.2016.
 */

public class GameMain {
    public static void main(String[] args) throws InterruptedException {


        int choise;

        System.out.println("Let's play the game Guess Number!");
        System.out.println("Chose the type of game:");
        do {
            System.out.println("1. You will guess the number");
            System.out.println("2. Computer will guess the number");
            System.out.println("3. Computer will play with computer");

            Scanner scanner = new Scanner(System.in);
            choise = scanner.next().charAt(0);
            switch (choise) {
                case '1':
                    humanWillGuess(scanner);
                    break;
                case '2':
                    computerWillGuessFromHuman(scanner);
                    break;
                case '3':
                    computerWillGuessFromComputer();
                    break;
            }
        } while (choise != '1' && choise != '2' && choise != '3');

    }

    private static void computerWillGuessFromComputer() {
        Random random = new Random();
        int key = random.nextInt(101);
        System.out.println("My number is " + key);
        PlayerWhoGuess playerWhoGuess = new PlayerWhoGuess();
        System.out.println(playerWhoGuess.computerGuessTheNumber(key));
    }

    private static void computerWillGuessFromHuman(Scanner scanner) {

        System.out.println("Think the number between 0 and 100");
        int key = scanner.nextInt();
        PlayerWhoGuess playerWhoGuess = new PlayerWhoGuess();
        System.out.println(playerWhoGuess.computerGuessTheNumber(key));

    }

    private static void humanWillGuess(Scanner scanner) {
        int key;
        PlayerWhoThink playerWhoThink = new PlayerWhoThink();
        PlayerWhoGuess playerWhoGuess = new PlayerWhoGuess();
        int number = playerWhoThink.numberToGuess();
        System.out.println("Ok. Try to guess the number between 0 and 100: ");

        do {
            System.out.println("Enter the number: ");
            key = scanner.nextInt();
            playerWhoGuess.humanGuessTheNumber(key, number);
        } while (key != number);
    }
}

