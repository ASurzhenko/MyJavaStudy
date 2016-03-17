package homeWork7.cryptographyTask;

/**
 * Created by Александр on 04.03.2016.
 */
public class Scrambler {

    private char[] key;

    public Scrambler(char[] key) {
        this.key = key;
    }

    public String crypt(String message) {
        char[] charArrayMessage = message.toCharArray();
        char[] cryptedMessage = new char[charArrayMessage.length];
        for (int i = 0; i < charArrayMessage.length; i++) {
            cryptedMessage[i] = (char) (charArrayMessage[i] ^ key[i % key.length]);
        }
        return String.copyValueOf(cryptedMessage);
    }
}
