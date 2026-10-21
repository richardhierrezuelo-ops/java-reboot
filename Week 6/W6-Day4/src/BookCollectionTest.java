import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BookCollectionTest {

    public static void main(String[] args) {
        Book book1 = new Book("9780134685991", "Effective Java", "Joshua Bloch");
        Book book2 = new Book("9780134685991", "Effective Java", "Joshua Bloch");
        Book book3 = new Book("9780134685991", "Effective Java — Revised Edition", "Joshua Bloch");
        Book book4 = new Book("9780132350884", "Clean Code", "Robert C. Martin");
        Book book5 = new Book("9781617294945", "Java Concurrency in Practice", "Brian Goetz");

        HashSet<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);

        System.out.println("Reference Equality (book1 == book2) : " + (book1 == book2) );
        System.out.println("Logical Equality (same ISBN) : " + book1.equals(book2) );
        System.out.println("Same ISBN, Different Title: " + book1.equals(book3) );
        System.out.println("Different ISBN: " + book1.equals(book4) );
        System.out.println("Same Object Reference : " + (book1 == book1) );
        System.out.println("Null Comparison : " + book1.equals(null) );
        System.out.println("Wrong Type Comparison: " + book1.equals("Effective Java") );
        System.out.println("Matching Hash Codes: " + (book1.hashCode() == book2.hashCode()));
        System.out.println("HashSet Size (3 duplicate ISBNs): " + bookSet.size() );

        bookSet.add(book4);
        bookSet.add(book5);
        System.out.println("HashSet Size (all 5 books): " + bookSet.size());
        System.out.println("ArrayList Size (all 5 books): " + bookList.size());
        System.out.println("Book Details: " + book1.toString());


        Book book6 = new Book(
                new String("9780134685991"),
                "Effective Java",
                "Joshua Bloch"
        );

        System.out.println(
                "Same ISBN Content, Different String Objects: "
                        + book1.equals(book6)
        );

    }
}
