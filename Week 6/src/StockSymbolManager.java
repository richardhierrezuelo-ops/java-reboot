import java.util.ArrayList;
import java.util.List;

public class StockSymbolManager {

    public static void main(String[] args) {
        List<String> symbols = new ArrayList<>();
        symbols.add("AAPL");
        symbols.add("MSFT");
        symbols.add("NVDA");
        System.out.println(symbols);

        symbols.add("AAPL");
        System.out.println(symbols);

        symbols.set(1, "GOOGL");
        System.out.println(symbols);

        symbols.remove("NVDA");
        System.out.println(symbols);

        System.out.println("Size: " + symbols.size());

        System.out.println("Contains AAPL: " + symbols.contains("AAPL"));

        for (String ticker : symbols) {
            System.out.println(ticker);
        }



    }

}