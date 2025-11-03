public class Day1 {
    public static void main(String[] args) {
        String name = "Rick";           // ← change to your real name
        int yearsOff = 1;
        record Comeback(String msg) {}      // Java 17+ candy

        var win = new Comeback("I never left — Day 1 done!");
        System.out.printf("%s took %d year off and is BACK Bitches on JDK %s%n",
                name, yearsOff, System.getProperty("java.version"));

        // Design Pattern #1: Singleton preview
        System.out.println(SingletonLogger.getInstance());
    }
}

// Singleton — thread-safe lazy (copy-paste, you’ll fix tomorrow)
class SingletonLogger {
    private static volatile SingletonLogger instance;
    private SingletonLogger() {}
    public static SingletonLogger getInstance() {
        if (instance == null) {
            synchronized (SingletonLogger.class) {
                if (instance == null) instance = new SingletonLogger();
            }
        }
        return instance;
    }
    @Override public String toString() { return "Logger ready ✔"; }
}