// Class representing a Student with basic attributes and behaviors
// Demonstrates encapsulation by keeping attributes private and exposing controlled access via methods
public class Student {
    // Attributes of the Student (kept private for data hiding)
    private int id;       // Unique identifier for the student
    private int age;      // Age of the student
    private String name;  // Name of the student
    private int nos;      // Number of subjects (or any other numeric property)
    private String gf;    // Sensitive data (hidden from outside access)

    // Getter methods provide controlled access to private attributes

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    // Setter method allows controlled modification of private attributes
    public void setAge(int age){
        // this.age=age;
        // adding an extra layer of authentication (example of encapsulation)
        if(age<100){
            this.age=age;
        }
    }
    public void setName(String name){
        this.name=name;
    }
    // Default constructor
    // Called when no arguments are provided during object creation
    public Student() {
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    // Allows initializing the Student object with specific values
    public Student(int id, int age, String name, int nos, String gf) {
        System.out.println("Parameterized constructor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf=gf;
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

    // Private method to simulate chatting behavior
    // Demonstrates data hiding: cannot be accessed outside the class
    private void gfChatting(){
        System.out.println(name + " chatting");
    }
}
