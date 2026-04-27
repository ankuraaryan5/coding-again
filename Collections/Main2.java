import java.util.Queue;
import java.util.Set;
import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.HashSet;
public class Main2 {
    public static void main(String[] args) {
        // // Queue<Integer> q = new LinkedList<>();
        // Deque<Integer> q = new LinkedList<>();
        // q.add(10);
        // q.add(20);
        // q.add(30); // if unseuccessful it throws an expection
        // q.offer(40); // if unsuccessful it returns false
        // System.out.println(q);
        // System.out.println(q.element()); // it throws an exception if queue is empty
        // System.out.println(q.peek()); // returns null if queue is empty
        // q.remove(); // it throws an exception if queue is empty
        // System.out.println(q);
        // q.poll(); // it returns the head of the queue or null if is empty
        // System.out.println(q);
        // q.addFirst(60);
        // System.out.println(q);
        // Stack using Deque
        // Deque<Integer> stack = new ArrayDeque<>();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // System.out.println(stack);
        // stack.pop();
        // System.out.println(stack);
        // System.out.println(stack.peek());
        // System.out.println(stack.peekFirst());
        // Priority Queue
        // Queue<Integer> pq= new PriorityQueue<>();
        // // In case of integers --> less value --> high priority --> minHeap
        // // lambda expression // Queue<Integer> pq= new PriorityQueue<>((a,b)->b-a); // now it is maxHeap
        // pq.offer(12);
        // pq.offer(90);
        // pq.offer(2);
        // pq.offer(43);
        // System.out.println(pq);
        // // [2, 43, 12, 90]
        // pq.poll();
        // System.out.println(pq);
        // // [12, 43, 90]
        // pq.poll();
        // System.out.println(pq);
        // // [43, 90]
        // // Note:  PriorityQueue guarantees only the head element is the smallest (or highest priority).
        // // MinHeap -->  smallest element is always at the root, ensuring quick access to the minimum value. It is commonly used to implement priority queues, where lower values have higher priority.
        // // pq--> integers --> comparators
        // Set --> stores only unique elements
        Set<Integer> set= new HashSet<>(); // ordering is random; access -> O(1)
        // Set<Integer> set= new LinkedHashSet<>(); //ordering is preserved; access -> O(n)
        // Set<Integer> set= new TreeSet<>(); // elements are sorted; access -> O(logN)
        set.add(10);
        set.add(10);
        System.out.println(set);
        // [10]
        set.add(20);
        set.add(20);
        set.add(20);
        System.out.println(set);
        // [20, 10]
        set.add(50);
        set.add(50);
        set.add(50);
        System.out.println(set);
        // [50, 20, 10]
        Set<Integer> set1= new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        System.out.println(set1);
        Set<Integer> set2= new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set1.retainAll(set2);
        System.out.println(set1);
        System.out.println(set2.containsAll(set1));
        System.out.println(set1.containsAll(set2));
        HashSet<Student> setnew= new HashSet<>();
        Student s1= new Student(1, "Ankur");
        Student s2= new Student(1, "Ankur");
        Student s3= new Student(1, "Ankur");
        setnew.add(s1);
        setnew.add(s2);
        setnew.add(s3);
        System.out.println(setnew);
    }
}