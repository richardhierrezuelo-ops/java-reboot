import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("Trade Like A Champion", 250, "20260510");
        Book b2 = new Book("How To Make Money In Stocks", 150, "20250101");
        Book b3 = new Book("Doom", 76, "20260510");
        Book b4 = new Book("Resident Evil", 180, "20260310");

        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        books.sort(Comparator.comparing(Book::getPublishedYear,Comparator.reverseOrder())  // Newest first
                .thenComparing(Book::getPages));   // Pages ascending

        for(Book book:books) {
            System.out.println(book);
        }
    }
}
