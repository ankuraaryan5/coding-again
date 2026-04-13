// Strings in Java
// A String is a sequence of characters

import java.util.*;
public class String1 {
    public static void main(String[] args) {
        // char ch = 'A'; 
        // char → primitive data type
        // ch → variable name
        // '' → character literal

        // String str = "Ankur"; 
        // String → non-primitive data type (class)
        // str → variable name
        // "" → string literal

        // Alternative way to create a String object:
        // String str = new String("Ankur");

        // String Pool → a special area inside heap memory
        // Example: String str = "Ankur"; 
        //   - "Ankur" is stored in the String Pool
        //   - variable str holds reference in stack
        // Example: String str = new String("Ankur");
        //   - "Ankur" stored directly in heap (not in String Pool)

        String fName = "Ankur";              // stored in String Pool
        String lName = new String("Aaryan"); // stored in heap
        System.out.println(fName + " " + lName);

        // length() → returns number of characters in the string
        System.out.println(fName.length());

        // Accessing characters:
        // fName[0] → invalid (Strings are not arrays)
        // Use charAt(index) instead
        System.out.println(fName.charAt(0));

        // Strings are immutable → once created, their value cannot be changed
        String name = "Ankur";
        // name[0] = 'N'; → error: Strings cannot be modified like arrays

        // But we can reassign the reference to a new String
        name = "Nnkur"; 
        System.out.println(name);
        // Note: The reference changed, not the original String object

        // Comparing Strings
        String name1 = "ankur";
        String name2 = "Ankur";

        // Method 1: Using '=='
        // Compares references (memory addresses), not values
        // if(name1 == name2) { ... }

        // Method 2: Using equals()
        // Compares actual string values (case-sensitive)
        // if(name1.equals(name2)) { ... }

        // Method 3: Using equalsIgnoreCase()
        // Compares values ignoring case differences
        if(name1.equalsIgnoreCase(name2)) {
            System.out.println("both strings are equal");
        } else {
            System.out.println("both strings are unequal");
        }
    }
}
