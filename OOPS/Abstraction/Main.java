// Example using Abstract Class
// ------------------------------------
// abstract class Bird{
//     // Abstract methods: must be implemented by subclasses
//     abstract void fly();
//     abstract void eat();
//
//     // Concrete method: already has implementation
//     public void sleep(){
//          System.out.println("bird is sleeping");
//     }
// }
//
// class Sparrow extends Bird{
//     // Must implement all abstract methods
//     void fly(){
//         System.out.println("Sparrow is flying");
//     }
//     void eat(){
//         System.out.println("Sparrow is eating");
//     }
// }
//
// class Crow extends Bird{
//     void fly(){
//         System.out.println("Crow is flying");
//     }
//     void eat(){
//         System.out.println("Crow is eating something spicy");
//     }
// }
//
// // Abstract class cannot be instantiated directly
// // Bird b = new Bird(); // ERROR
// // But we can use polymorphism:
// // Bird b = new Sparrow(); // works
// // Bird b = new Crow();    // works
//
// // Key points about Abstract Class:
// // - Can have both abstract and concrete methods
// // - Can have instance variables and constructors
// // - Supports single inheritance (extends)
// // - Good when classes share a common base with default behavior
// ------------------------------------


// Example using Interface
// ------------------------------------
package Abstraction;

interface Bird {
    // All methods are implicitly public and abstract
    void fly();
    void eat();

    // Default method: provides implementation inside interface
    default void sleep(){
        System.out.println("Bird is sleeping");
    }
}

class Sparrow implements Bird {
    // Must declare methods as public (cannot reduce visibility)
    public void fly(){
        System.out.println("Sparrow is flying");
    }
    public void eat(){
        System.out.println("Sparrow is eating");
    }
}

class Crow implements Bird {
    public void fly(){
        System.out.println("Crow is flying");
    }
    public void eat(){
        System.out.println("Crow is eating something spicy");
    }
}

public class Main {
    public static void doBirdStuff(Bird b){
        b.eat();   // Calls implementation of eat()
        b.fly();   // Calls implementation of fly()
        b.sleep(); // Uses default method from interface
    }

    public static void main(String[] args) {
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());

        // Example of abstraction using collections:
        // List is an interface, ArrayList is its implementation.
        java.util.List<String> birds = new java.util.ArrayList<>();
        birds.add("Sparrow");
        birds.add("Crow");

        for (String bird : birds) {
            System.out.println("Bird in collection: " + bird);
        }
    }
}

// Key points about Interface:
// - Defines a contract (methods must be implemented)
// - Methods are implicitly public and abstract (unless default/static)
// - Cannot have instance variables (only constants)
// - Supports multiple inheritance (implements multiple interfaces)
// - Good when classes are unrelated but share common behavior
// ------------------------------------
