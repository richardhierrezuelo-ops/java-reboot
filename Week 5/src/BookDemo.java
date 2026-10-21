public class BookDemo {
    public static void main(String[] args) {


//   MessageFormatter     Pattern: Model an Entity — Fields + Methods
            Book b1 = new Book("Richard", "Java Basics", 300);
            System.out.println(b1.displayInfo());

            Book b2 = new Book();
            b2.setAuthor("Portia");
            b2.setTitle("Kitty Books");
            b2.setPageCount(250);
            System.out.println(b2.displayInfo());

            try {
                b1.setPageCount(-150);
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println(b1.displayInfo());

    }
}
