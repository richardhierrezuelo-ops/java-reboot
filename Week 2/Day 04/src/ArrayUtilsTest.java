public class ArrayUtilsTest {

    public static void main(String[] args) {
        try {
            ArrayUtils.printArray(new String[] {"Rick", "Portia", "Anna", "Mike"});
            ArrayUtils.printArray(new Integer[] {1,2,3,4,5});
            ArrayUtils.printArray(null);
            ArrayUtils.printArray(new Double[] {});
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
}
