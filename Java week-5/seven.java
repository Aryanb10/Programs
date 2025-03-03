//Aryan Bisht
//RA2311003011435
import java.util.*;

public class seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 1st Number : ");
        int a = scanner.nextInt();
        System.out.println("Enter a 2nd Number : ");
        int b = scanner.nextInt();
        check(a, b);
    }

    static void check(int a, int b) {
        if (a == b || a - b == 5 || a + b == 5) {
                System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}