//Aryan Bisht
//RA2311003011435
import java.util.Scanner;
public class three{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Press 1 for juice or 2 for soda: ");
    System.out.print("Enter your choice: ");
    int choice = scanner.nextInt();
    if (choice == 1)
    System.out.println("Dispensing juice");
    else if (choice == 2)
    System.out.println("Dispensing soda");
    else
    System.out.println("Invalid choice");
    scanner.close();
}
}