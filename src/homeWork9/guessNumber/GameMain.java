package homeWork9.guessNumber;

import homeWork9.guessNumber.computer.Computer;
import homeWork9.guessNumber.human.Human;

import java.util.Scanner;

/**
 * Created by Александр on 28.03.2016.
 */
public class GameMain {
    public static void main(String[] args) throws InterruptedException {


        int choise;
        int key;
        char answer;
        int counter = 0;
        System.out.println("Let's play the game Guess Number!");
        System.out.println("Chose the type of game:");
        do {
            System.out.println("1. Computer will guess the number");
            System.out.println("2. You will guess the number");
            System.out.println("3. Computer will play with computer");

            Scanner scanner = new Scanner(System.in);
            choise = scanner.next().charAt(0);
            switch (choise) {
                case '1':
                    computerWillGuess(scanner);
                    break;
                case '2':
                    System.out.println("Ok. Then think a number between 0 and 100");
                    Computer computer = new Computer();
                    System.out.println("Enter the number: ");
                    computer.setNumberToGuess(scanner.nextInt());
                    System.out.println(computer.getNumberToGuess());

                    System.out.println("The number is: ");
                    int diapasone = 101;
                    key = (int) (Math.random() * diapasone);
                    counter++;
                    while (key != computer.getNumberToGuess()) {
                        if (key == computer.getNumberToGuess()) {
                            System.out.println("You guessed! My number is " + computer.getNumberToGuess());
                            System.out.println("You guessed from try " + counter);
                        } else {
                            answer = scanner.next().charAt(0);
                            if (answer == '>') {
                                diapasone = key;
                                key = (int) (Math.random() * (diapasone - key) + (key + 1));
                                System.out.println(key);
                                counter++;
                            } else if (answer == '<') {
                                int diapasone1 = key;
                                key = (int) (Math.random() * diapasone);
                                System.out.println(key);
                                counter++;
                            }
                        }

                    }
                    break;
                case '3':
                    break;

            }
        } while (choise != '1' && choise != '2' && choise != '3');

    }

    private static void computerWillGuess(Scanner scanner) {
        int key;
        Human human = new Human();
        human.setNumberToGuess((int) (Math.random() * 101));
        System.out.println("Ok. Try to guess the number between 0 and 100: ");

        do {
            System.out.println("Enter the number: ");
            key = scanner.nextInt();
            human.guessTheNumber(key);
        } while (key != human.getNumberToGuess());
    }
}
