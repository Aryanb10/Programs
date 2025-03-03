//Aryan Bisht
//RA2311003011435
interface Flyable {
    void fly_obj();
}
class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("The spacecraft is flying in space.");
    }
}
class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("The airplane is flying through the sky.");
    }
}
class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("The helicopter is hovering in the air.");
    }
}
public class eight {
    public static void main(String[] args) {
        Flyable spacecraft = new Spacecraft();
        Flyable airplane = new Airplane();
        Flyable helicopter = new Helicopter();
        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}
