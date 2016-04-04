
package homeWork9.guessNumber;

import java.util.Scanner;

/**
 * Created by Александр on 28.03.2016.
 */

public class GameMain {
    public static void main(String[] args) throws InterruptedException {

        int choise;
        int number;

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
                    ComputerThink computerThink1 = new ComputerThink(0, 100);
                    HumanGuess humanGuess = new HumanGuess(0, 100);

                    new PersonWhoKeepsTheGame().start(computerThink1, humanGuess);

                    break;
                case '2':
                    System.out.println("Enter the secret number: ");
                    number = scanner.nextInt();
                    HumanThink humanThink = new HumanThink(0, 100, number);
                    ComputerGuess computerGuess2 = new ComputerGuess(0, 100);

                    new PersonWhoKeepsTheGame().start(humanThink, computerGuess2);

                    break;
                case '3':
                    ComputerThink computerThink3 = new ComputerThink(0, 100);
                    ComputerGuess computerGuess = new ComputerGuess(0, 100);

                    new PersonWhoKeepsTheGame().start(computerThink3, computerGuess);
            }
        } while (choise != '1' && choise != '2' && choise != '3');


    }
}