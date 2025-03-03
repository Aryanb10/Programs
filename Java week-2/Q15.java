//Aryan Bisht
//RA2311003011435
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = scanner.nextInt();

        do { 
            System.out.println("enter a number");
            n=scanner.nextInt();
        } while (n<0);
        System.out.println("The number was positive");
        scanner.close();
    }
}
