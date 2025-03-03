//Aryan Bisht
//RA2311003011435
public class Student {
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
    public static void main(String[] args) {
        Student student1 = new Student("Aryan", 19, "RA435", 9.1, "Navi Mumbai");
        Student student2 = new Student("Tejash", 19, "RA446", 8.5, "Bihar");

        System.out.println("Details of Student 1:");
        student1.printDetails();

        System.out.println("Details of Student 2:");
        student2.printDetails();
    }
}