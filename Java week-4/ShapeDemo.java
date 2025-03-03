//Aryan Bisht
//RA2311003011435
abstract class Shape {
    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double calculateArea() {
        return width * height;
    }
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}
class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
    public String toString() {
        return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5.0, 3.0);
        Shape circle = new Circle(4.0);
        Shape triangle = new Triangle(3.0, 4.0, 5.0);

        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        System.out.println();

        System.out.println(circle);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println();

        System.out.println(triangle);
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}
