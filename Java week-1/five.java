//Aryan Bisht
//RA2311003011435
import java.util.Scanner;
public class five{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    int number =scanner.nextInt();
    if (number>0){
        System.out.println("The number is positive");
    }
    else if (number<0){
        System.out.println("The number is negative");
    }
    else{
        System.out.println("The number is zero");
    }
    scanner.close();
    }
}