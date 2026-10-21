public class ExtendThreadVersion extends Thread {

    public ExtendThreadVersion(String name) {
        super(name);   // calls Thread(String name)
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
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
        ExtendThreadVersion alpha = new ExtendThreadVersion("Alpha");
        ExtendThreadVersion beta = new ExtendThreadVersion("Beta");

        alpha.start();
        beta.start();

    }

}
