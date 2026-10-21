public class RunnableThread implements Runnable {
    @Override
    public void run() {
        for (int i=1; i<=10; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
