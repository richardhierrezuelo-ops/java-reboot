import java.util.HashMap;
import java.util.Map;

public class StockFrequencyCounter {
    public static void main(String[] args) {
        Map<String, Integer> tickerMap = new HashMap<>();

        String[] symbols = {
                "AAPL", "MSFT", "AAPL",
                "NVDA", "MSFT", "AAPL",
                "TSLA"
        };

        for(String symbol : symbols) {

            if (tickerMap.containsKey(symbol)) {
                tickerMap.put(symbol, tickerMap.get(symbol) + 1);
            } else {
                tickerMap.put(symbol, 1);
            }
        }

        System.out.println("Unique Stock Symbols: " + tickerMap.size());
        System.out.println("AAPL: " + tickerMap.get("AAPL"));
        System.out.println("GOOGL: " + tickerMap.containsKey("GOOGL"));

        for (Map.Entry<String, Integer> entry : tickerMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
