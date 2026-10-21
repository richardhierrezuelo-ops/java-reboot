import static java.lang.Thread.sleep;

public class VolatileFlag {

    public static void main(String[] args) {

        try {
            VolatileImplementation worker = new VolatileImplementation();
            Thread t = new Thread(worker, "Worker-Thread");

            t.start();                      // Start worker thread

            Thread.sleep(2000);             // Let it run for 2 seconds
            System.out.println("Main thread requesting stop...");
            worker.stop();                  // Signal the worker to stop

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
