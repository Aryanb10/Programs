//Aryan Bisht
//RA2311003011435
abstract class Shape {
    public abstract double getPerimeter();
    public abstract double getArea();
}

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class five {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Perimeter of the circle: " + circle.getPerimeter());
        System.out.println("Area of the circle: " + circle.getArea());
    }
}
