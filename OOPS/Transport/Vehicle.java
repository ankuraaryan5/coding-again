// ======================= PACKAGE: Transport =======================

package Transport;

public class Vehicle {

    // private String name;
    // If name were private:
    // Accessible only inside Vehicle class itself.
    // Child classes like Car / MotorCycle / Truck could NOT access directly.

    public String name;
    // public => accessible everywhere:
    // same package, different package, subclass, normal object access.

    // public String model;
    protected String model;
    // protected => accessible:
    // 1. Same package classes
    // 2. Subclasses even in different package
    // Good for inheritance use-cases.

    // public int noOfTyres;
    int noOfTyres;
    // default / package-private access modifier.
    // Accessible only inside same package (Transport).
    // NOT accessible directly in different package non-subclass object.
    // Subclass in different package also cannot access through object reference.

    public Vehicle() {
        // Default constructor

        this.name = "";
        this.model = "";
        this.noOfTyres = 4;
    }

    Vehicle(String name, String model, int noOfTyres) {
        // package-private constructor
        // Accessible only inside same package Transport.
        // Car and MotorCycle can use it because they are in same package.

        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    void startEngine() {
        // package-private method
        // Accessible only inside same package.
        // Car/Main can call because same package.
        // Outside package TestMain cannot call directly.

        System.out.printf("Engine is starting for %s: %s%n", name, model);
    }

    void stopEngine() {
        // same concept as startEngine()

        System.out.printf("Engine is stopped for %s: %s%n", name, model);
    }
}