package Transport;

public class Main {

    public static void main(String[] args) {

        Car c = new Car("Maruti", "Alto", 4, 4, "Auto");

        // Object of child class created.
        // Child object contains:
        // Parent fields + Parent methods + Child fields + Child methods

        c.startEngine();
        // Inherited method from Vehicle

        c.startAC();
        // Car's own method

        c.stopEngine();
        // Inherited method

        System.out.println(c.name);
        // public field from parent class

        // MotorCycle m = new MotorCycle("Splendor", "+", 2, "U", "Soft");
        // m.startEngine();
        // m.wheelie();
        // m.stopEngine();

        // If uncommented:
        // Valid because all classes are inside same package Transport.
    }
}