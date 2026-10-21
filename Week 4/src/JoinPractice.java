public class JoinPractice {
    public static void main(String[] args) throws InterruptedException {
        Thread worker  = new Thread(() -> {
            try {
                System.out.println("Worker started");
                Thread.sleep(2000);
                System.out.println("Worker finished");
            } catch(InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(Thread.currentThread().getName() + " was interrupted");
                return;
            }
        }, "Worker-Thread");

        worker.start();

        System.out.println("Main is waiting for worker to finish...");
        worker.join();

        System.out.println("Main finished.");
    }
}
