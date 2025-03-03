//Aryan Bisht
//RA2311003011435
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = scanner.nextInt();
        int fact=1,i=1;

        do{
            fact*=i;
            i++;
        }
        while(i<=n);
        System.out.println(fact);
        scanner.close();
    }
}