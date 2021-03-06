package homeWork.IO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by Александр on 17.04.2016.
 */
public class CreateFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name and extension of the file you want to create (name.extension):");
        System.out.println("You can also create folders where your file will exist (someFolder/someFolder/yourFileName.extension)");

        String fileName = scanner.next();

        fileCreating(fileName);

        output(fileName);

        input(fileName);
    }

    private static void input(String fileName) {
        try (DataInputStream dataOutputStream = new DataInputStream(new FileInputStream(fileName))) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void output(String fileName) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName))) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileCreating(String fileName) {
        Path path = Paths.get(fileName);

        try {
            if (path.getParent() != null) {
                Files.createDirectories(path.getParent());
            }
            Files.createFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
