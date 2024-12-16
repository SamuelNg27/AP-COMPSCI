package pkg;
import java.util.Scanner;
import java.util.Random;

public class Dog {
    private String name;   // Stores the name of the Dog
    private int age;       // Stores the age of the Dog
    private String breed;  // Stores the breed of the Dog

    // Empty Constructor
    public Dog() {
        name = "Clifford";
        age = 3;
        breed = "big red dog";
    }

    // Name Constructor
    public Dog(String name) {
        this.name = name;
        this.age = 1;
        this.breed = "dog dog";
    }

    // Name and Breed Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        this.age = 1;
    }

    // Name and Age Constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.breed = "dog dog";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isSleeping() {
        Random rand = new Random();
        return rand.nextBoolean(); // 50/50 chance
    }

    public void bark() {
        System.out.println(name + " barks!");
    }

    public void dogToString() {
        System.out.println("------------------------------");
        System.out.println("Dog Name: " + name);
        System.out.println("Dog Age: " + age);
        System.out.println("Dog Breed: " + breed);
        System.out.println("------------------------------");
    }
}
