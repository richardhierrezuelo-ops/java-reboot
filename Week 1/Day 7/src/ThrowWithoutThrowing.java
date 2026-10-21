//In this kata, you'll have to throw some Exceptions, but throwing an exception is so easy, so your code shouldn't contain the following substrings:
//
//Class
//Exception
//Error
//Throwable
//throw
//u
//Which means, you cannot use the reflection API or use new to create Exception instances.
//
//You have to implement some static methods, and the name of each method tells you which Exception you're expected to throw in that method.
//
//Have fun!


import java.util.*;

public class ThrowWithoutThrowing {

    public static void arrayIndexOutOfBound() {
        int[] arr = {1, 2, 3};
        int x = arr[10];
    }

    public static void negativeArraySize() {
        int[] arr = new int[-1];
    }

    public static void noSuchElement() {
        Iterator<?> it = Collections.emptyList().iterator();
        it.next();
    }

    public static void arithmetic() {
        int x = 10 / 0;
    }

    public static void classCast() {
        Object o = "string";
        Integer i = (Integer) o;
    }

    public static void stackOverflow() {
        stackOverflow();
    }

    public static void nullPointer() {
        String s = null;
        s.length();
    }

    public static void numberFormat() {
        Integer.parseInt("abc");
    }

    public static void illegalArgument() {
        Thread.currentThread().setPriority(99);
    }

    public static void emptyStack() {
        Stack<String> stack = new Stack<>();
        stack.pop();                    // Cleanest way
    }

    public static void bufferOverflow() {
        byte[] data = new byte[5];
        java.nio.ByteBuffer buffer = java.nio.ByteBuffer.wrap(data);

        buffer.position(5);           // Move to the end of capacity
        buffer.put((byte) 99);        // This causes BufferOverflowException
    }

    public static void arrayStore() {
        Object[] arr = new String[1];
        arr[0] = 123;                   // ArrayStoreException
    }

    public static void unsupportedOperation() {
        List<String> list = Collections.emptyList();
        list.add("test");
    }

    public static void illegalState() {
        Iterator<?> it = Collections.emptyList().iterator();
        it.remove();
    }
}