//Aryan Bisht
//RA2311003011435
import java.util.Scanner;

public class Q1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n =  scanner.nextInt();
        int fac = 1;

        for (int i=1 ; i<=n ; i++) {
            fac *= i;
        }

        System.out.println("The factorial of " + n + " : " + fac);
        scanner.close();
    }
}

