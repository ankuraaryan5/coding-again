package Polymorphism;

public class Main {
    // Two types of Polymorphism:
    // 1. Static/Compile-time → Method overloading
    // 2. Runtime → Method overriding + dynamic method dispatch

    public static void main(String[] args){
        // ---------- Static Polymorphism ----------
        Calculator c = new Calculator();
        System.out.println(c.add(1, 9));          // calls add(int, int)
        System.out.println(c.add(1, 9, 25));      // calls add(int, int, int)
        System.out.println(c.add(1, 9, 65, 9.2)); // calls add(int, int, int, double)

        // ---------- Runtime Polymorphism ----------
        // Upcasting: reference of parent type pointing to child object
        Shape s1 = new Circle(); 
        s1.draw(); // "Drawing a circle" → resolved at runtime

        Shape s2 = new Rectangle();
        s2.draw(); // "Drawing a rectangle" → resolved at runtime

        // Passing subclass objects to a method expecting parent type
        doDrawStuff(new Circle());    // dynamic dispatch → Circle's draw()
        doDrawStuff(new Rectangle()); // dynamic dispatch → Rectangle's draw()

        // Downcasting example (unsafe if not checked)
        Shape s3 = new Circle();
        Circle c1 = (Circle) s3; // valid downcast
        c1.draw(); // "Drawing a circle"
        
        // Shape s4 = new Rectangle();
        // Circle c2 = (Circle) s4; // ❌ runtime error (ClassCastException)
    }

    // Dynamic method dispatch: decides which draw() to call at runtime
    public static void doDrawStuff(Shape s){
        s.draw(); // resolved dynamically depending on actual object
    }
}
