//Aryan Bisht
//RA2311003011435
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Exponent : ");
        int n = scanner.nextInt();
        int i = 1;

        do {
            System.out.println(Math.pow(2,i));
            i++;
            n--;
        } while (n != 0);
        scanner.close();
    }
}
