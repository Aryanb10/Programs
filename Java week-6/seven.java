//Aryan Bisht
//RA2311003011435
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle implements Resizable {
    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }
    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }
    public int getArea() {
        return width * height;
    }
    public void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}
public class seven {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Initial Rectangle:");
        rectangle.display();
        System.out.println("Area: " + rectangle.getArea());
        rectangle.resizeWidth(15);
        rectangle.resizeHeight(10);
        System.out.println("\nResized Rectangle:");
        rectangle.display();
        System.out.println("Area: " + rectangle.getArea());
    }
}
