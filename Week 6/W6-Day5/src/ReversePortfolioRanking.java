import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class ReversePortfolioRanking {

    public static void main(String[] args) {
        TreeMap<String, Double> portfolioMap = new TreeMap<>(Collections.reverseOrder());
        portfolioMap.put("Growth", 25000.00);
        portfolioMap.put("Retirement", 80000.00);
        portfolioMap.put("Swing", 15000.00);
        portfolioMap.put("Dividend", 40000.00);

        for(Map.Entry<String, Double> entry : portfolioMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        System.out.println("First: " + portfolioMap.firstKey());
        System.out.println("Last: " + portfolioMap.lastKey());
    }
}
