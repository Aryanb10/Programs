//Aryan Bisht
//RA2311003011435
import java.util.Scanner;
public class eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the Year : ");
        int a = scanner.nextInt();
        
        if(a%4 == 0) {
            if(a%100 != 0) {
                System.out.println("It's a leap year");
            } else if (a%100 == 0 && a%400 == 0) {
                System.out.println("It's a leap year");
            }
        } else {
            System.out.println("It's not a leap year");
        }
        scanner.close();
    }
}