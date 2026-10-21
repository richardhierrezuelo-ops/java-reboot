import java.util.HashSet;
import java.util.Set;

public class UniqueStockSymbolTracker {
    public static void main(String[] args) {

        Set<String> uniqueTickers = new HashSet<>();
        uniqueTickers.add("AAPL");
        uniqueTickers.add("MSFT");
        uniqueTickers.add("NVDA");
        uniqueTickers.add("AAPL");
        uniqueTickers.add("MSFT");

        System.out.println(uniqueTickers.size());
        System.out.println(uniqueTickers.contains("AAPL"));
        System.out.println(uniqueTickers.remove("NVDA"));
        System.out.println(uniqueTickers.size());
        for (String ticker: uniqueTickers) {
            System.out.println(ticker);
        }

        System.out.println(uniqueTickers.add("AAPL"));
        System.out.println(uniqueTickers);
        System.out.println(uniqueTickers.add("TSLA"));
        System.out.println(uniqueTickers);


    }
}
