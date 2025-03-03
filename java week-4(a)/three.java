//Aryan Bisht
//RA2311003011435
import java.util.Scanner;

public class three {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = getInputArray(scanner);
        double average = calculateAverage(numbers);
        System.out.println("The average of the array is: " + average);
        
        scanner.close();
    }
    public static int[] getInputArray(Scanner scanner) {
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        return array;
    }
    
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        return (double) sum / numbers.length;
    }
}
