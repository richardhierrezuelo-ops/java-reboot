public class MathUtilsTest {
    public static void main(String[] args) {
        System.out.println(MathUtils.sum(1, 2, 3, 4));        // 10
        System.out.println(MathUtils.sum());                  // 0

        System.out.println(MathUtils.max(5, 9, 2, 12, 7));    // 12
        System.out.println(MathUtils.min(5, 9, 2, 12, 7));    // 2
    }
}