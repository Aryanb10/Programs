//Name:- Aryan Bisht
//Reg.no:- 2311003011435
class Rectangle {
    double Height;
    double Width;
    
    public void set(double a, double b) {
    Height = a;
    Width = b;
    }
    public void area() {
    System.out.println("The Area: " + (Height * Width));
    }
    public void perimeter() {
    System.out.println("The Perimeter: " + 2 * (Height + Width));
    }
    }
    public class seven {
    
    public static void main(String[] args) {
    Rectangle r = new Rectangle();
    r.set(10, 44);
    r.perimeter();
    r.area();
    }
    }