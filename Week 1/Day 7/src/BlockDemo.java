public class BlockDemo {
    public static void main(String[] args) {

        Block b = new Block(new int[] {1,2,3});
        System.out.println("Width: " + b.getWidth());
        System.out.println("Height: " + b.getHeight());
        System.out.println("Length: " + b.getLength());
        System.out.println("Volume: " + b.getVolume());
        System.out.println("Surface Area: " + b.getSurfaceArea());

     }
}
