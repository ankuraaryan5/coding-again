public class App{
    public static void main(String[] args){
        // Example using the default constructor
        // Creates a Student object without passing any arguments
        // The default constructor will be invoked automatically
        // After creation, we manually assign values to the object's fields
        // This approach is useful when you want to initialize properties later
        Student A = new Student();   // Calls the default constructor
        // A.id = 1;                    // ❌ Direct access not allowed (attributes are private)
        // A.age = 15;                  // ❌ Direct access not allowed
        // A.name = "Ankur";            // ❌ Direct access not allowed
        // A.nos = 5;                   // ❌ Direct access not allowed

        // Instead, use getters and setters for encapsulation
        A.setName("Ankur");
        System.out.println(A.getName());
        A.setAge(20);
        System.out.println(A.getAge());

        // Example using the parameterized constructor
        // Creates a Student object with specific values
        // Student A = new Student(1, 16, "Ankur", 5, "Vanessa");

        // Displaying the properties of the Student object using getters
        System.out.println(A.getName());
        A.setAge(150); // Will not update because of encapsulation check
        System.out.println(A.getAge());

        // Calling methods on the Student object
        A.bunk();   // Prints that the student is bunking
        A.study();  // Prints that the student is studying
        A.sleep();  // Prints that the student is sleeping
        // A.gfChatting(); // ❌ Not allowed because gfChatting() has private access in Student

        // Copy Constructor
        // This would create a new Student object B with the same values as A
        // Student B = new Student(A);
        // System.out.println(B.getName());
        // B.bunk();
        // B.study();
        // B.sleep();
    }
}
