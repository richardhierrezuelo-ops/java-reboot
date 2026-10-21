package fundamentals.methods;

public class ScopeTest {
    public static void main(String[] args) {
        int val = 100;
        Integer boxedVal = 100;
        StringBuilder sb = new StringBuilder("Java");

        modifyValues(val, boxedVal, sb);

        System.out.println("PRINT 1: " + val);
        System.out.println("PRINT 2: " + boxedVal);
        System.out.println("PRINT 3: " + sb);
    }

    public static void modifyValues(int a, Integer b, StringBuilder c) {
        a = a + 50;
        b = b + 50;
        c.append(" Reboot");
    }
}
