//Aryan Bisht
//RA2311003011435
class Student {
    
    private String name;
    private int age;
    private String regNo;
    private double cgpa;
    private String address;

    public Student(String name, int age, String regNo, double cgpa, String address) {
        this.name = name;
        this.age = age;
        this.regNo = regNo;
        this.cgpa = cgpa;
        this.address = address;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Registration Number: " + regNo);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Address: " + address);
        System.out.println(); 
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        
        Student student1 = new Student("Aryan", 20, "RA435", 9.1, "Kharghar");
        Student student2 = new Student("Tejash", 21, "RA445", 9.04, "Baka Bihar");

        System.out.println("Student 1 Details:");
        student1.printDetails();
        
        System.out.println("Student 2 Details:");
        student2.printDetails();
    }
}