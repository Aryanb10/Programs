//Aryan Bisht
//RA2311003011435
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = scanner.nextInt();
        int sum = 0;

        while (n != 0) {
            sum += n;
            n--;
        }

        System.out.println("The sum : " + sum);
        scanner.close();
    }
}
