public class ProductTest {
    public static void main (String[] args) {

        Product p1 = new Product("Playstation 5", 800, "Game Console");
        Product p2 = new Product("SteamCube", 1300, "Game Console");
        Product p3 = new Product("Xbox Series X", 900, "Game Console");

        System.out.println(p1.name() + " Is Expensive: " + p1.isExpensive() );
        System.out.println(p2.name() + " Is Expensive: " + p2.isExpensive() );
        System.out.println(p3.name() + " Is Expensive: " + p3.isExpensive() );
    }
}
