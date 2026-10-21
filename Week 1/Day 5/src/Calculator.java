public class Calculator {

//    2. Method Overloading & Varargs

    // Overloaded methods
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Varargs (variable arguments) - very useful
    public int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}