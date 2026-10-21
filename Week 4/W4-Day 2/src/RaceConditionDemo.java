public class RaceConditionDemo {

    static class Counter {
        private int count = 0;
        private final Object lock = new Object();

        public void  increment() {
            synchronized (lock) {
                count++;
            }
        }

        public int getCount() {
            synchronized (lock) {
                return count;
            }
        }
    }

    static class IncrementTask implements Runnable {
        private Counter counter;

        public IncrementTask(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(new IncrementTask(counter), "Thread-1");
        Thread t2 = new Thread(new IncrementTask(counter), "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());  // Often less than 2000
    }
}
