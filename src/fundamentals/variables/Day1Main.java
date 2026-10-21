package fundamentals.variables;

public class Day1Main {
    public static void main(String[] args) {
        // Primitive behavior
        int x = 10;
        int y = x; // Copy of value 10 is created
        y = 20;    // x remains 10
        System.out.println("x: " + x + ", y: " + y); // x: 10, y: 20

        // Reference behavior
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1; // Copies the reference to the same array, not the array itself
        arr2[0] = 99;      // Modifies array in Heap

        System.out.println("arr1[0]: " + arr1[0]); // Prints 99!
    }
}