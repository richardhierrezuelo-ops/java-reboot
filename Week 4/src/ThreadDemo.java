public class ThreadDemo {
    public static void main(String[] args) {
        MainThread mainThread = new MainThread();
        mainThread.setName("MainThread");
        mainThread.start();

        Thread thread = new Thread(new RunnableThread(), "RunnableThread");
        thread.start();

        System.out.println("Main thread finished starting others");

    }
}
