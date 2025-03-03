//Aryan Bisht
//RA2311003011435
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int a=scanner.nextInt();
        int [] b;
        b=new int [a];
        int avg=a;
        int c=0,d=0;

        while(c<a){
            System.out.println("Enter the number");
            b[c]=scanner.nextInt();
            c++;
        }
        while(d<a){
            avg+=b[d];
            d++;
        }
        System.out.println("The average is :" +(avg/a));
        scanner.close();
    }
}
