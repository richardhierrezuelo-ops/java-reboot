public class BasicRunnableThread implements Runnable {
    @Override
        public void run() {
        for (int i =1; i<=5; i++) {
            System.out.println("Running in thread: " + Thread.currentThread().getName() + " - iteration " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(Thread.currentThread().getName() + " was interrupted");
                return;
            }
        }

    }

    public static void main(String[] args) {
        Thread alpha = new Thread(new BasicRunnableThread(), "Alpha");
        Thread beta = new Thread(new BasicRunnableThread(), "Beta");

        alpha.start();
        beta.start();

    }

}
