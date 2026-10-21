public class Book {
    private String title;
    private int pages;
    private String publishedYear;

    public Book(String title, int pages, String publishedYear) {
        this.title = title;
        this.pages = pages;
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getPublishedYear() {
     return publishedYear;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Pages: " + pages + ", Published Year: " + publishedYear;
    }
}
