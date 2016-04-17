package homeWork.IO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;

/**
 * Created by Александр on 18.04.2016.
 */
public class ProductivityTest {
    public static void main(String[] args) {

        //creating();
        Instant notBufferedBegin = Instant.now();
        notBufferedCopy();
        Instant notBufferedEnd = Instant.now();
        Duration notBufferedOperation = Duration.between(notBufferedBegin, notBufferedEnd);
        System.out.println("Not buffered copy operation: " + notBufferedOperation);

        Instant bufferedBegin = Instant.now();
        bufferedCopy();
        Instant bufferedEnd = Instant.now();
        Duration bufferedOperation = Duration.between(bufferedBegin, bufferedEnd);
        System.out.println("Buffered copy operation: " + bufferedOperation);

    }

    private static void creating() {
        Path path = Paths.get("someFile.txt");

        try {
            Files.createFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void notBufferedCopy() {
        try {
            InputStream inputStream = new FileInputStream("someFile.txt");
            OutputStream outputStream = new FileOutputStream("someFile_notBufferedCopy.txt");

            int value;
            while ((value = inputStream.read()) != -1) {
                outputStream.write(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void bufferedCopy() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("someFile.txt"));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("someFile_bufferedCopy.txt"));

            int value;
            while ((value = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
