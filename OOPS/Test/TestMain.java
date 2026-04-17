// ======================= PACKAGE: Test =======================

package Test;

import Transport.*;

public class TestMain {

    public static void main(String[] args) {

        Vehicle v = new Vehicle();

        // public constructor works because Vehicle() is public.

        // System.out.println(v.noOfTyres);

        // ❌ COMPILE ERROR HERE:
        // noOfTyres is package-private in Transport package.
        // TestMain is in Test package.
        // So cannot access directly.

        // Error:
        // noOfTyres is not public in Vehicle; cannot be accessed from outside package

        // System.out.println(v.model);

        // ❌ COMPILE ERROR if uncommented:
        // model is protected.
        // Protected member cannot be accessed using parent object reference
        // from non-subclass class in different package.

        // Error:
        // model has protected access in Vehicle

        Truck t = new Truck();

        // Valid because Truck extends Vehicle
    }
}