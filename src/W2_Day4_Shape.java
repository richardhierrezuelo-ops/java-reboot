public class W2_Day4_Shape {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5.0),
                new Rectangle(4.0, 7.0),
                new Triangle(3.0, 6.0)
        };

        System.out.println("=== SHAPE CALCULATOR ===\n");

        for (Shape s : shapes) {
            System.out.println(s);                    // uses toString()
            System.out.printf("Area = %.2f%n", s.getArea());
            System.out.println("-------------------");
        }
    }
}

// YOUR TASK: Complete the hierarchy below

abstract class Shape {
    // TODO: make this class abstract
    // TODO: declare abstract method double getArea()
    // TODO: add a reasonable toString() that will be overridden
    public abstract double getArea();
    @Override
    public String toString() {return "Unknown Shape";}
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
    // TODO: implement getArea() → Math.PI * radius * radius
    // TODO: override toString() → "Circle with radius X.X"
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle " + width + " x " + height;
    }
    // TODO: implement getArea() → width * height
    // TODO: override toString() → "Rectangle X.X x Y.Y"
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle base " + base + " height " + height;
    }

    // TODO: implement getArea() → 0.5 * base * height
    // TODO: override toString() → "Triangle base X.X height Y.Y"
}
