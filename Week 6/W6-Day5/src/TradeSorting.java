import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TradeSorting {
    public static void main(String[] args) {
        List<Trade> tradeList = new ArrayList<>();
        tradeList.add(new Trade("AAPL", 50));
        tradeList.add(new Trade("MSFT", 20));
        tradeList.add(new Trade("NVDA", 100));
        tradeList.add(new Trade("GOOGL", 35));

        System.out.println(tradeList);

        Comparator<Trade> byQuantity =
                Comparator.comparingInt(Trade::getQuantity);

        tradeList.sort(Comparator.comparingInt(Trade::getQuantity));
        System.out.println(tradeList);

        tradeList.sort(Comparator.comparingInt(Trade::getQuantity).reversed());
        System.out.println(tradeList);

    }
}
