import java.util.*;
public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        // nextLine() → reads the entire line including spaces
        // next() → reads only the next word (stops at space)
        // Example: input "Hello World"
        //   sc.nextLine() → "Hello World"
        //   sc.next() → "Hello"
        String str = sc.next();
        System.out.println("Your string is: ");
        System.out.println(str);

        // ------------------- Common String Methods -------------------

        // 1. length() → returns number of characters
        System.out.println("Length: " + str.length()); 
        // Example: "Hello".length() → 5

        // 2. charAt(int index) → returns character at given position
        System.out.println("First char: " + str.charAt(0)); 
        // Example: "Hello".charAt(1) → 'e'

        // 3. substring(int beginIndex, int endIndex) → extracts part of string
        // endIndex is exclusive
        if(str.length() >= 4) {
            System.out.println("Substring(1,4): " + str.substring(1,4));
            // Example: "Hello".substring(1,4) → "ell"
        }

        // 4. contains(CharSequence s) → checks if substring exists
        System.out.println("Contains 'lo'? " + str.contains("lo")); 
        // Example: "Hello".contains("lo") → true

        // 5. equals(Object o) → compares values (case-sensitive)
        System.out.println("Equals 'Hello'? " + str.equals("Hello")); 
        // Example: "Hello".equals("hello") → false

        // 6. equalsIgnoreCase(String s) → compares values ignoring case
        System.out.println("EqualsIgnoreCase 'hello'? " + str.equalsIgnoreCase("hello")); 
        // Example: "Hello".equalsIgnoreCase("hello") → true

        // 7. toUpperCase() → converts to uppercase
        System.out.println("Uppercase: " + str.toUpperCase()); 
        // Example: "Hello".toUpperCase() → "HELLO"

        // 8. toLowerCase() → converts to lowercase
        System.out.println("Lowercase: " + str.toLowerCase()); 
        // Example: "Hello".toLowerCase() → "hello"

        // 9. trim() → removes leading and trailing spaces
        String spaced = "   Hello   ";
        System.out.println("Trimmed: '" + spaced.trim() + "'"); 
        // Example: "   Hello   ".trim() → "Hello"

        // 10. split(String regex) → splits string into array
        String sentence = "Java is fun";
        String[] words = sentence.split(" ");
        System.out.println("Split words: " + Arrays.toString(words)); 
        // Example: "Java is fun".split(" ") → ["Java","is","fun"]

        // 11. startsWith(String prefix) → checks beginning
        System.out.println("Starts with 'He'? " + str.startsWith("He")); 
        // Example: "Hello".startsWith("He") → true

        // 12. endsWith(String suffix) → checks ending
        System.out.println("Ends with 'lo'? " + str.endsWith("lo")); 
        // Example: "Hello".endsWith("lo") → true

        // 13. valueOf(any type) → converts other types to String
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println("ValueOf int: " + numStr); 
        // Example: String.valueOf(123) → "123"

        // 14. toCharArray() → converts string to char array
        char[] chars = str.toCharArray();
        System.out.println("Char array: " + Arrays.toString(chars)); 
        // Example: "Hello".toCharArray() → ['H','e','l','l','o']

        // 15. isEmpty() → checks if string length == 0
        System.out.println("Is empty? " + "".isEmpty()); 
        // Example: "".isEmpty() → true

        // 16. isBlank() → checks if string is empty or only whitespace
        System.out.println("Is blank? " + "   ".isBlank()); 
        // Example: "   ".isBlank() → true

        // 17. replace(char oldChar, char newChar) → replaces characters
        System.out.println("Replace 'l' with 'p': " + str.replace('l','p')); 
        // Example: "Hello".replace('l','p') → "Heppo"
    }
}
