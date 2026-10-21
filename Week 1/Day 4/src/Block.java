//Requirements
//The constructor should take an array as an argument, this will contain 3 integers of the form [width, length, height] from which the Block should be created.
//
//Define these methods:
//
//`getWidth()` return the width of the `Block`
//
//`getLength()` return the length of the `Block`
//
//`getHeight()` return the height of the `Block`
//
//`getVolume()` return the volume of the `Block`
//
//`getSurfaceArea()` return the surface area of the `Block`
//Examples
//    Block b = new Block(new int[]{2,4,6}) -> creates a `Block` object with a width of `2` a length of `4` and a height of `6`
//    b.getWidth() // -> 2
//
//    b.getLength() // -> 4
//
//    b.getHeight() // -> 6
//
//    b.getVolume() // -> 48
//
//    b.getSurfaceArea() // -> 88
//Note: no error checking is needed
//
//Any feedback would be much appreciated

public class Block {

    private final int width;
    private final int length;
    private final int height;


    public Block(int[] numberArray) {
        this.width = numberArray[0];
        this.length = numberArray[1];
        this.height = numberArray[2];
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
        return length * width * height;
    }

    public int getSurfaceArea() {
        return  ((length * width) + (length * height) + (width * height)) * 2;
    }

    @Override
    public String toString() {
        return "Block{width=" + width + ", length=" + length + ", height=" + height + "}";
    }

}
