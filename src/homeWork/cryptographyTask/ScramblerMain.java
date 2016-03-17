package homeWork.cryptographyTask;

/**
 * Created by Александр on 04.03.2016.
 */
public class ScramblerMain {
    public static void main(String[] args) {

        String message = "Message";
        String key = "Secret";
        char[] charArrayKey = key.toCharArray();

        Scrambler scrambler = new Scrambler(charArrayKey);

        System.out.println(scrambler.crypt(message));
    }
}
