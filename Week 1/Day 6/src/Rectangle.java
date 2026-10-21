public final class Rectangle {

    private final int height;
    private final int width;

    public Rectangle(int height, int width) {
        if (height < 0 || width < 0) {
            throw new IllegalArgumentException("Height and Width must be positive");
        }
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    // Useful methods for immutable class
    public int getArea() {
        return height * width;
    }

    public int getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public String toString() {
        return "Rectangle{height=" + height + ", width=" + width + "}";
    }
}