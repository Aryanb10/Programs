//Aryan Bisht
//RA2311003011435
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public void printDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
        System.out.println();
    }
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Initial details of the Circle:");
        circle.printDetails();

        circle.setRadius(10.0);

        System.out.println("Updated details of the Circle:");
        circle.printDetails();
    }
}
