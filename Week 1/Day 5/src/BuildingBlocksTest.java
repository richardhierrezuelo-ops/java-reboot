public class BuildingBlocksTest {

    public static void main(String[] args) {
        BuildingBlocks bb = new BuildingBlocks(new int[] {2,4,6});

        System.out.println("Width: " + bb.getWidth());
        System.out.println("Length: " + bb.getLength());
        System.out.println("Height: " +bb.getHeight());
        System.out.println("Volume: " + bb.getVolume());
        System.out.println("SurfaceArea: " + bb.getSurfaceArea());
    }

}
