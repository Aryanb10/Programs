//Aryan Bisht
//RA2311003011435
import java.util.*;

public class two {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = scanner.nextLine();
        System.out.println("Enter a reversed string : ");
        String r = scanner.nextLine();
        check(s, r);
    }

    static void check(String a, String b) {

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(b.length() - i - 1)) {
                count++;
            }
        }
        if (count == a.length()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}