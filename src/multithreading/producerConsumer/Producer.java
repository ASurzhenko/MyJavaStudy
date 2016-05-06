package multithreading.producerConsumer;

/**
 * Created by User on 06.05.2016.
 */
public class Producer implements Runnable{
    private Bucket bucket;

    public Producer(Bucket backet) {
        this.bucket = backet;
    }

    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            bucket.put();
        }
    }
}
