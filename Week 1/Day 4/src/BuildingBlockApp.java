public class BuildingBlockApp {

    public static void main(String[] args) {
        Block b = new Block(new int[]{2,4,6});

        System.out.println("Width: " + b.getWidth());
        System.out.println("Length: " + b.getLength());
        System.out.println("Height: " + b.getHeight());

        System.out.println("Volume: " + b.getVolume());
        System.out.println("Surface Area: " + b.getSurfaceArea());

    }
}
