//Aryan Bisht
//RA2311003011435
import java.util.*;

public class eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = scanner.nextLine();
        count(s);
    }

    static void count(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
        }
        System.out.println("Length of String: " + count);
    }
}