//Aryan Bisht
//RA2311003011435
import java.util.*;

public class four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = scanner.nextLine();
        check(s);
    }

    static void check(String s) {
        String a = s;
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == s.charAt(s.length() - i - 1)) {
                count++;
            }
        }
        if (count == a.length()) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}