//Aryan Bisht
//RA2311003011435
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n=scanner.nextInt();
        
        int i=1;
        
        while(i<=n) {
            System.out.println(i);
            i++;
        }
        scanner.close();
    }
}