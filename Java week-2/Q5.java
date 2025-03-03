//Aryan Bisht
//RA2311003011435
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Principal : ");
        int principal = scanner.nextInt();
        System.out.print("Enter the rate : ");
        float rate = scanner.nextFloat();
        System.out.print("Enter the time : ");
        int time = scanner.nextInt();
        float SI;

        SI = (principal * rate * time)/100;

        System.out.println("The simple interest : " + SI);
        scanner.close();
    }
}
