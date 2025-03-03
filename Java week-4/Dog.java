//Aryan Bisht
//RA2311003011435
public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println();
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", "German Shepherd");
        Dog dog2 = new Dog("Bella", "Labrador");

        System.out.println("Initial details of Dog 1:");
        dog1.printDetails();

        System.out.println("Initial details of Dog 2:");
        dog2.printDetails();
        dog1.setName("Max");
        dog1.setBreed("Golden Retriever");

        dog2.setName("Lucy");
        dog2.setBreed("Beagle");

        System.out.println("Updated details of Dog 1:");
        dog1.printDetails();

        System.out.println("Updated details of Dog 2:");
        dog2.printDetails();
    }
}