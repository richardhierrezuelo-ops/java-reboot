import java.util.*;

public class PortfolioPerformanceRanking {
    public static void main(String[] args) {

        TreeMap<String, Double> portfolioMap = new TreeMap<>();
        portfolioMap.put("Growth", 32000.00);
        portfolioMap.put("Retirement", 95000.00);
        portfolioMap.put("Swing", 18000.00);
        portfolioMap.put("Dividend", 45000.00);
        portfolioMap.put("Aggressive", 12000.00);

        for (Map.Entry<String, Double> entry : portfolioMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println();

        List<Map.Entry<String, Double>> rankingList = new ArrayList<>(portfolioMap.entrySet());
        rankingList.sort(Map.Entry.comparingByValue());
        for (Map.Entry<String, Double> entry : rankingList) {
            System.out.println(
                    entry.getKey() + ": $" + entry.getValue()
            );
        }

        System.out.println();

        for (Map.Entry<String, Double> entry : portfolioMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }




    }
}
