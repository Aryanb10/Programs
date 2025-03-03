//Aryan Bisht
//RA2311003011435
import java.util.Scanner;
public class seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 1 for addition or 2 for subtraction");
        
        System.out.print("Enter your choice : ");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter 1st no. : ");
            int a = scanner.nextInt();
            System.out.print("Enter 2nd no. : ");
            int b = scanner.nextInt();
            int c = a + b;
            System.out.println("Sum : " + c);
        } else if (choice == 2) {
            System.out.print("Enter 1st no. : ");
            int x = scanner.nextInt();
            System.out.print("Enter 2nd no. : ");
            int y = scanner.nextInt();
            int z = x - y;
        } else {
            System.out.println("Invalid Choice");
        }

            scanner.close();
    }
}