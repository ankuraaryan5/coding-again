package Transport;

public class Car extends Vehicle {

    public int noOfDoors;
    public String transmissionType;

    Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType) {

        // super(...) calls parent constructor first.
        // Must always be first statement in constructor.

        super(name, model, noOfTyres);

        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;

        // super.startEngine();
        // super.stopEngine();

        // If uncommented:
        // valid because methods belong to parent and Car is child class
        // and same package.
    }

    public void startAC() {
        // Car-specific behaviour

        System.out.println("Starting AC for " + name);

        // name inherited from Vehicle.
        // Direct access works because name is public.
    }
}