import java.util.Objects;

public class Book {

    private String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object obj) {

        // Step 1: Same object in memory?
        if (this == obj) {
            return true;
        }

        // Step 2: Null or wrong class?
        if (!(obj instanceof Book)) {
            return false;
        }

        // Step 3: Convert Object to Book
        Book other = (Book) obj;

        // Step 4: Compare book isbn
        return Objects.equals(this.isbn, other.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "ISBN : " + isbn + " Title: " + title + " Author: " + author;
    }

}
