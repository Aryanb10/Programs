//Aryan Bisht
//RA2311003011435
import java.util.Scanner;
public class four{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the current temp in degree celsius: ");
        int temperature = scanner.nextInt();
        if (temperature > 30)
        System.out.println("Its hot!");
        else if (temperature >= 20)
        System.out.println("Its warm");
        else if (temperature >=10)
        System.out.println("Its cool");
        else 
        System.out.println("Its cold");
        scanner.close();
    }
}