//Name:- Aryan Bisht
//Reg.no:- 2311003011435
class Car {
    int year;
    String model;
    String color;
    
    public void CarInfo(int y, String m, String c) {
    year = y;
    model = m;
    color = c;
    }
    }
    public class six {
    public static void main(String[] args) {
    Car c = new Car();
    Car c1 = c;
    c.CarInfo(2014, "XYLO", "Blue");
    System.out.println("Model: " + c.model);
    System.out.println("Year: " + c1.year);
    System.out.println("Color: " + c1.color);
    }
    }