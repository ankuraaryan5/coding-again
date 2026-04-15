public class App{
    public static void main(){
        // Example using the default constructor
        // Creates a Student object without passing any arguments
        // The default constructor will be invoked automatically
        // After creation, we manually assign values to the object's fields
        // This approach is useful when you want to initialize properties later
        /*
        Student A = new Student();   // Calls the default constructor
        A.id = 1;                    // Assigns student ID
        A.age = 15;                  // Assigns student age
        A.name = "Ankur";            // Assigns student name
        A.nos = 5;                   // Assigns number of subjects

        // Displaying the properties of the Student object
        System.out.println(A.name);
        System.out.println(A.id);
        System.out.println(A.age);
        System.out.println(A.nos);

        // Calling methods on the Student object
        A.bunk();   // Prints that the student is bunking
        A.study();  // Prints that the student is studying
        A.sleep();  // Prints that the student is sleeping
        */

        // Example using the parameterized constructor
        // Creates a Student object with specific values
        Student A = new Student(1, 15, "Ankur", 5);

        // Displaying the properties of the Student object
        System.out.println(A.name);
        System.out.println(A.id);
        System.out.println(A.age);
        System.out.println(A.nos);

        // Calling methods on the Student object
        A.bunk();
        A.study();
        A.sleep();
        // Copy Constructor
        // This would create a new Student object B with the same values as A
        /*
        Student B = new Student(A);
        System.out.println(B.name);
        System.out.println(B.id);
        System.out.println(B.age);
        System.out.println(B.nos);
        B.bunk();
        B.study();
        B.sleep();
        */
    }
}