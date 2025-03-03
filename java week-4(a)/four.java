//Aryan Bisht
//RA2311003011435
import java.util.Random;

public class four {

    public static void main(String[] args) {
        int size = 10; 
        int minRange = 1; 
        int maxRange = 100; 
        
        int[] numbers = fillArray(size, minRange, maxRange);
        int largest = findLargest(numbers);
        
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("The largest number in the array is: " + largest);
    }
    public static int[] fillArray(int size, int minRange, int maxRange) {
        Random random = new Random();
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(maxRange - minRange + 1) + minRange;
        }
        
        return array;
    }
    public static int findLargest(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        
        int largest = numbers[0];
        
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        
        return largest;
    }
}
