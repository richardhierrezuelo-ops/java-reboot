public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair("Age", 35);
        Pair<String, String> p2 = new Pair("Language", "Java");
        Pair<Integer, Boolean > p3 = new Pair(1, true );

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
