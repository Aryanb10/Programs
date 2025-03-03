//Aryan Bisht
//RA2311003011435
import java.util.Arrays;
import java.util.Random;

public class one {

    public static void main(String[] args) {
        
        int numStudents = 30;
        int[] grades = new int[numStudents];
        
        Random random = new Random();
        for (int i = 0; i < numStudents; i++) {
            grades[i] = random.nextInt(101); 
        }
        
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = sum / numStudents;
        System.out.println("Average Grade: " + average);
        
        int highestGrade = grades[0];
        int lowestGrade = grades[0];
        for (int grade : grades) {
            if (grade > highestGrade) {
                highestGrade = grade;
            }
            if (grade < lowestGrade) {
                lowestGrade = grade;
            }
        }
        System.out.println("Highest Grade: " + highestGrade);
        System.out.println("Lowest Grade: " + lowestGrade);
        
        Arrays.sort(grades);
        System.out.println("Top 5 Scores:");
        for (int i = numStudents - 1; i >= numStudents - 5; i--) {
            System.out.println(grades[i]);
        }
    }
}
