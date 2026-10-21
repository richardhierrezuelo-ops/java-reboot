public class VolatileImplementation implements Runnable {

    private volatile boolean running = true;

    public void stop() {
        running = false;
    }

    @Override
    public void run() {
        int count = 0;
        while (running) {
            count++;
            System.out.println(Thread.currentThread().getName() + " - Count: " + count);

            // Optional: slow it down a bit so you can see the output
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println(Thread.currentThread().getName() + " stopped.");
    }

}
