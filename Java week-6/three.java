//Aryan Bisht
//RA2311003011435
public class three {
    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        three three = new three();
        System.out.println("Addition of 2 and 3: " + three.add(2, 3));
        System.out.println("Addition of 2.5 and 3.7: " + three.add(2.5f, 3.7f));
        System.out.println("Addition of 2, 3, and 4: " + three.add(2, 3, 4));
    }
}