//Aryan Bisht
//RA2311003011435
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a even number: " ) ;
        int n=scanner.nextInt();
        for ( int i=0; i<n; i+=2)
        {
        System.out.println(i);
        }
         scanner.close();
    }
}
