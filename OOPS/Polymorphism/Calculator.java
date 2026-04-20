package Polymorphism;

public class Calculator {
    
    // Method overloading: same method name "add" but different parameter lists
    int add(int a, int b){
        return a + b; // adds two integers
    }

    int add(int a, int b, int c){
        return a + b + c; // adds three integers
    }

    double add(int a, int b, int c, double d){
        return a + b + c + d; // adds three integers and one double
    }
}
