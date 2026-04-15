// Class representing a Student with basic attributes and behaviors
public class Student {
    // Attributes of the Student
    public int id;       // Unique identifier for the student
    public int age;      // Age of the student
    public String name;  // Name of the student
    public int nos;      // Number of subjects (or any other numeric property)

    // Default constructor
    // Called when no arguments are provided during object creation
    public Student() {
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    // Allows initializing the Student object with specific values
    public Student(int id, int age, String name, int nos) {
        System.out.println("Parameterized constructor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    // Copy constructor
    // Creates a new Student object by copying values from another Student object
    public Student(Student srcobj) {
        System.out.println("Copy constructor called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
    }

    // Method to simulate studying behavior
    public void study() {
        System.out.println(name + " studying");
    }

    // Method to simulate sleeping behavior
    public void sleep() {
        System.out.println(name + " sleeping");
    }

    // Method to simulate bunking behavior
    public void bunk() {
        System.out.println(name + " bunking");
    }
}
