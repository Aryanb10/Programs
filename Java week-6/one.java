//Aryan Bisht
//RA2311003011435
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        class Person {
            private String name;
            private int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people would you like to create? ");
        int numPeople = scanner.nextInt();
        scanner.nextLine(); 

        Person[] people = new Person[numPeople];

        for (int i = 0; i < numPeople; i++) {
            System.out.print("Enter person " + (i + 1) + "'s name: ");
            String name = scanner.nextLine();
            System.out.print("Enter person " + (i + 1) + "'s age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 
            people[i] = new Person(name, age);
        }

        System.out.println("\nHere are the people's details:");
        for (int i = 0; i < numPeople; i++) {
            System.out.println("Name: " + people[i].getName() + ", Age: " + people[i].getAge());
        }
    }
}