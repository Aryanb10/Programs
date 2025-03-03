//Aryan Bisht
//RA2311003011435
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = scanner.nextInt();
        System.out.println("The Multiplication table for " + n + " : ");

        for(int i = 1 ; i <= 10 ; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }scanner.close();

    }
}
