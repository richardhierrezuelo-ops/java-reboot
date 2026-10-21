public class Day1_Generics {
    public static void main(String[] args) {
        // 1. Create a generic Box class (see below)
        //    It should hold ANY type T

        // 2. Create a Box<String> and put "Hello" in it
        //    Print the content
        Box<String> stringBox = new Box<>("Hello");

        // 3. Create a Box<Integer> and put 42 in it
        //    Print the content
        Box<Integer> intBox = new Box<>(42);


        // 4. Try to put a String in the Integer box → should NOT compile!
//        intBox.setItem("RDH");

        // 5. Use a generic method printBox(Box<T> box) to print any box
        //    Call it with both boxes
        printBox(stringBox);
        printBox(intBox);

        System.out.println("\n=== GENERICS DEMO COMPLETE ===");
    }

    // TODO: Create this generic method
    // It should print: "Box contains: [value]"
    private static void printBox(Box<?> box) {
        // Use wildcard ? to accept any Box<T>
        System.out.println("Box contains: " + box.getItem());
    }
}

// YOUR TASK: Create the generic Box class here
// It should have:
// - private final T item
// - constructor that takes T
// - getter T getItem()
// - toString() that returns "Box[" + item + "]"

class Box<T> {
    private final T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Box[" +  (item == null ? "null" : item) + "]";
    }
}
