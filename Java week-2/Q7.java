//Aryan Bisht
//RA2311003011435
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int n = scanner.nextInt();
        int i = 1;

        while (i != n+1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}
