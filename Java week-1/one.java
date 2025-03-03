//Aryan Bisht
//RA2311003011435
import java.util.Scanner;
public class one{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0)
        System.out.println("The number is even");
        else 
        System.out.println("The number is odd");
        scanner.close();
    }
}