import java.util.Map;
import java.util.TreeMap;

public class PortfolioValueRanking {
    public static void main(String[] args) {

        TreeMap<String, Double> portfolioMap = new TreeMap<>();
        portfolioMap.put("Growth", 25000.00);
        portfolioMap.put("Retirement", 80000.00);
        portfolioMap.put("Swing", 15000.00);
        portfolioMap.put("Dividend", 40000.00);

        for (Map.Entry<String, Double> entry : portfolioMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        portfolioMap.put("Swing", 18500.00);
        System.out.println("\n");

        for (Map.Entry<String, Double> entry : portfolioMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("\n");

        System.out.println("First: " + portfolioMap.firstKey());
        System.out.println("Last: " + portfolioMap.lastKey());


        // Calls to firstKey() and lastKey() give compilation error as
        // they do not appear to be valid with this version of java
        //    Here is workaround based on our counter pattern
        int first = 1;
        int last = portfolioMap.size();
        int count = 1;

        for (Map.Entry<String, Double> entry : portfolioMap.entrySet()) {
            if (count == first) {
                System.out.println("First: " + entry.getKey() + " " + entry.getValue());
            } else if (count == last) {
                System.out.println("Last: " + entry.getKey() + " " + entry.getValue());
            }
            count ++;
        }

    }
}
