package multithreading;

import java.io.PipedWriter;
import java.io.PrintStream;

/**
 * Created by User on 29.04.2016.
 */
public class NumberPrinter implements Runnable {
    public void run() {
        Thread currentThread = Thread.currentThread();
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ignore) {
                currentThread.isInterrupted();
            }
            PrintStream writer = System.out;
            String name = currentThread.getName();
            System.out.println(name + " " + i);

            if (currentThread.isInterrupted()) {
                return;
            }
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
