public class Block {
    private int width;
    private int length;
    private int height;

    public Block  (int[] paramArray) {
        this.width =  paramArray[0];
        this.length = paramArray[1];
        this.height = paramArray[2];
    }


    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width * length *  height;
    }

    public int getSurfaceArea() {
        return 2 * ((length * height) + (length * width) + (width * height));
    }
}
