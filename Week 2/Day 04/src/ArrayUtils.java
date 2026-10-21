public class ArrayUtils {

    public static <T> void printArray(T[] array) {
        if (array == null || array.length == 0) {
            throw new NullPointerException("Array is null");
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\n");
        }
    }
}
