package Test;

import Transport.Vehicle;

public class Truck extends Vehicle {

    Truck() {

        super();

        // Calls public Vehicle() constructor.
        // If Vehicle() were not public -> compile error.

        this.name = "Tata";

        // Valid because name is public.

        System.out.println("Hi I m driving a truck");

        // this.noOfTyres = 12;

        // ❌ COMPILE ERROR HERE:
        // noOfTyres has default/package-private access.
        // Truck is subclass but in different package.
        // package-private members are NOT inherited outside package.

        // Error:
        // noOfTyres is not public in Vehicle; cannot be accessed from outside package

        // If noOfTyres were protected/public then this would work.
    }
}