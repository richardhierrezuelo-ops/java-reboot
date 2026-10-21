import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookSortMain {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Street Fighter", 100));
        books.add(new Book("Lord of the Rings", 350));
        books.add(new Book("Bloodbourne", 75));
        books.add(new Book("Final Fantasy",90));

        books.sort(Comparator.comparing(Book::getPages));
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
