import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = scanner.nextInt();
        int sum = 0;

        do {
            sum += n;
            n--;
        } while (n != 0);

        System.out.println("The sum : " + sum);
        scanner.close();
    }
}
