//Aryan Bisht
//RA2311003011435
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n=scanner.nextInt();
        int a=1;

        do { 
            System.out.println(n +"x"+ a +"="+n*a);
            a++;
        } while (a<11);
        scanner.close();
    }
}
