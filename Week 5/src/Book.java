public class Book {

    private String author;
    private String title;
    private int pageCount;

    public Book() {}

    public Book(String author, String title, int pageCount) {
        this.author = author;
        this.title = title;
        setPageCount(pageCount);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPageCount(int pageCount) {
        if (pageCount < 0) {
            throw new IllegalArgumentException("Page Count Cannot be Negative");
        }
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String displayInfo() {
        return "Author: " + author + " Title: " + title + " Page Count: " + pageCount;
    }

}
