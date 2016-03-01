package cryptographyTask;

/**
 * Created by Александр on 01.03.2016.
 */
public class CryptographyMain {
    public static void main(String[] args) {

        String message = "Hello World!";
        char key = 'A';

        String cryptedString = Cryptography.cryptStringWithCharKey(message, key);
        System.out.println("Crypted string " + message + " - " + cryptedString);

        String decryptedString = Cryptography.cryptStringWithCharKey(cryptedString, key);
        System.out.println("Decrypted string " + cryptedString + " - " + decryptedString);

    }
}

