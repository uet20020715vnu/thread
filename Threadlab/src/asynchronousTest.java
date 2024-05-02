import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class asynchronousTest {

    public static final int NUM_OF_THREAD = 5;

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(NUM_OF_THREAD);

        for (int i = 1; i <= 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
        }
        executor.shutdown();
        System.out.println("Finished all threads");
    }
}