//Aryan Bisht
//RA2311003011435
import java.util.Scanner;

public class six {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score : ");
        int score = scanner.nextInt();
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("Grade : A (Excellent)");
                break;
            case 8:
                System.out.println("Grade : B (Very Good)");
                break;
            case 7:
                System.out.println("Grade : C (Good)");
                break;
            case 6:
                System.out.println("Grade : D (Satisfactory)");
                break;
            default:
                if (score >= 0 && score < 60) {
                    System.out.println("Grade : F (Fail)");
                } else {
                    System.out.println("Invalid Score");
                }
                break;
        }
        scanner.close();
    }

}