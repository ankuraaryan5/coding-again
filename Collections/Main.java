import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        // -------------------- ArrayList Section --------------------
        // ArrayList is a resizable array implementation of List.
        // It allows random access (get by index) and is efficient for lookups.
        
        ArrayList<Integer> arr = new ArrayList<>();
        // reference ArrayList              //implementation ArrayList
        // List<Integer> list= new ArrayList<>();
        // Collection <Integer> collection= new ArrayList<>();
        
        arr.add(10);   // adds element at the end
        arr.add(20);
        arr.add(30);
        System.out.println(arr); // prints [10, 20, 30]
        
        arr.add(40);   // adds another element
        System.out.println(arr); // prints [10, 20, 30, 40]
        
        arr.remove(0); // removes element at index 0 (value 10)
        System.out.println(arr); // prints [20, 30, 40]
        
        
        // -------------------- List Interface Section --------------------
        // List is an interface. ArrayList implements it.
        // Using List reference allows flexibility to switch implementations.
        
        List<Integer> list = new ArrayList<>();
        list.add(101);
        list.addAll(arr); // adds all elements from arr
        System.out.println(list); // prints [101, 20, 30, 40]
        
        list.removeAll(arr); // removes all elements that are also in arr
        System.out.println(list.size()); // prints 1
        System.out.println(list); // prints [101]
        
        list.clear(); // removes all elements
        System.out.println(list.size()); // prints 0
        
        // Iterating using Iterator
        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(); // prints 20 30 40
        
        
        // -------------------- LinkedList Section --------------------
        // LinkedList implements both List and Deque.
        // It allows efficient insertion/removal at both ends.
        
        List<Integer> newlist = new LinkedList<>();
        newlist.add(32);
        newlist.add(54);
        newlist.add(45);
        
        System.out.println(newlist.get(0)); // 32
        System.out.println(newlist.get(1)); // 54
        System.out.println(newlist.get(2)); // 45
        // System.out.println(newlist.get(3)); // would throw IndexOutOfBoundsException
        
        newlist.set(0, 34); // updates element at index 0
        System.out.println(newlist.get(0)); // prints 34
        
        Collections.sort(newlist); // sorts list in ascending order
        System.out.println(newlist); // prints [34, 45, 54]
        
        
        // -------------------- LinkedList as Deque Section --------------------
        // LinkedList has extra methods (addFirst, addLast, removeFirst, etc.)
        // These methods are NOT available in List interface, only in LinkedList/Deque.
        
        LinkedList<Integer> ar = new LinkedList<>(newlist);
        System.out.println(ar); // [34, 45, 54]
        
        System.out.println(ar.indexOf(45));     // finds first index of 45
        System.out.println(ar.lastIndexOf(45)); // finds last index of 45
        
        ar.addFirst(56); // adds element at beginning
        ar.addLast(76);  // adds element at end
        System.out.println(ar); // [56, 34, 45, 54, 76]
        
        ar.remove(3); // removes element at index 3 (value 54)
        ar.remove(3); // removes element at new index 3 (value 76)
        System.out.println(ar); // [56, 34, 45]
        
        ar.addFirst(23); // adds element at beginning
        System.out.println(ar); // [23, 56, 34, 45]
        
        ar.removeFirst(); // removes first element
        System.out.println(ar); // [56, 34, 45]
        
        ar.removeLast(); // removes last element
        System.out.println(ar); // [56, 34]
        
        System.out.println(ar.getFirst()); // gets first element (56)
        System.out.println(ar.getLast());  // gets last element (34)
        
        System.out.println(ar.peek()); // retrieves first element without removing (56)
        System.out.println(ar.poll()); // retrieves and removes first element (56)
        System.out.println(ar); // [34]
        
        
        // -------------------- ArrayList Capacity Section --------------------
        // ensureCapacity() increases internal capacity but does not change size.
        // Useful when you know you'll add many elements to avoid resizing overhead.
        
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100); // reserves capacity for 100 elements
        System.out.println(marks.isEmpty()); // true, because no elements added yet

        
        // -------------------- Vector Section --------------------
        // Vector is similar to ArrayList but synchronized (thread-safe).
        // It was part of early Java collections before ArrayList was introduced.
        // Methods: add(), remove(), get(), size(), capacity(), etc.
        
        Vector<Integer> vec = new Vector<>();
        vec.add(11);
        vec.add(22);
        vec.add(33);
        System.out.println(vec); // prints [11, 22, 33]
        
        vec.remove(1); // removes element at index 1 (value 22)
        System.out.println(vec); // prints [11, 33]
        
        System.out.println("Capacity of vector: " + vec.capacity()); 
        // capacity shows internal storage size (default 10, grows as needed)
        
        
        // -------------------- Stack Section --------------------
        // Stack extends Vector and represents LIFO (Last-In-First-Out).
        // Methods: push(), pop(), peek(), search(), empty().
        
        Stack<Integer> stack = new Stack<>();
        stack.push(100); // push adds element on top
        stack.push(200);
        stack.push(300);
        System.out.println(stack); // [100, 200, 300]
        
        System.out.println(stack.peek()); // returns top element (300) without removing
        System.out.println(stack.pop());  // removes and returns top element (300)
        System.out.println(stack);        // [100, 200]
        
        System.out.println(stack.search(100)); // returns 2 (position from top, 1-based)
        System.out.println(stack.empty());     // false, because stack has elements
    }    
}
