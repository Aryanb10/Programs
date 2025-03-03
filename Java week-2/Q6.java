//Aryan Bisht
//RA2311003011435
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = scanner.nextInt();
        System.out.println("The Multiplication table for " + n + " : ");
        int i = 1;

        while (i != 11) {
            System.out.println(n + " * " + i + " = " + n*i);
            i++;
        }scanner.close();
    }
}
