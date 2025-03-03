//Aryan Bisht
//RA2311003011435
import java.util.*;

public class nine {
    public static void printCombinations(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && j != k && i != k) {
                        System.out.println(digits[i] + "" + digits[j] + "" + digits[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] digits;
        digits = new int[3];
        System.out.println("Enter 3 digits: ");
        Scanner scanner = new Scanner(System.in);
        digits[0] = scanner.nextInt();
        digits[1] = scanner.nextInt();
        digits[2] = scanner.nextInt();
        printCombinations(digits);
        scanner.close();
    }
}