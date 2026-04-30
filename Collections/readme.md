# Java Collection Framework
It is a tool/interfcae which provides implementation of various data structure like linked list, arrays, stacks, maps, etc which we can use to replicate the behaviour of those particular data structures

# methods of collection
add()
size()
remove()
iterator()
addAll()
removeAll()
clear()

# Explain collection hierarchy 
Collection (interface) -->  List (interface) → Ordered collection, allows duplicates.
ArrayList → Resizable array implementation.
LinkedList → Doubly linked list implementation.
Vector → Synchronized resizable array.
Stack → LIFO stack built on Vector.

Set (interface) → Unordered collection, no duplicates.
HashSet, LinkedHashSet, TreeSet.

Queue (interface) → FIFO or other ordering rules.
PriorityQueue, Deque, etc.

Map (interface) → Key-value pairs.
HashMap, LinkedHashMap, TreeMap, Hashtable

# List Interface
A List is an ordered collection that allows duplicate elements. It provides positional access and manipulation.

# methods
add()
addAll()
get()
iterator()
set()
remove()
removeAll()
clear()
size()
toArray()
contains()

# ArrayList
ArrayList is a class that implements a resizable array.
Provides fast random access (get() and set() are O(1)).
Slower for insertions/removals in the middle (O(n)).
Not synchronized (not thread-safe).

# What is the difference between shallow copy and deep copy?
Shallow Copy → Copies references, not actual objects. Changes in the original affect the copy.

Deep Copy → Copies actual objects recursively. Changes in the original do not affect the copy.

# What is a linked list?
A LinkedList is a data structure where each element (node) contains data and a reference to the next (and previous, in doubly linked lists).
Efficient for insertions/removals at both ends.
Slower for random access compared to ArrayList.

# Difference between linked list array and arraylist
Array → Fixed size, fast random access, cannot grow dynamically.
ArrayList → Resizable array, dynamic size, fast random access, slower insertions/removals.
LinkedList → Dynamic size, efficient insertions/removals, slower random access.

# What is java vector how is it different than arraylist?
Legacy class, similar to ArrayList.
Synchronized → Thread-safe, but slower in single-threaded contexts.
Has methods like capacity() to check internal storage size.
Rarely used today; ArrayList is preferred unless synchronization is required.

# Difference Between Vector and ArrayList
ArrayList → Not synchronized, faster in single-threaded use.
Vector → Synchronized, safe for multi-threaded use.
Synchronization prevents race conditions but adds overhead.

# Stack
Stack is a subclass of Vector that implements LIFO (Last-In-First-Out) behavior.
Common Methods
push() → Add element on top.
pop() → Remove and return top element.
peek() → Return top element without removing.
search() → Return position of element from top (1-based).
empty() → Check if stack is empty.

# Queue
A Queue is a collection designed for holding elements prior to processing. It follows FIFO (First-In-First-Out) order.

Common Implementations:

LinkedList

PriorityQueue

ArrayDeque

Methods:

add() → throws exception if insertion fails

offer() → returns false if insertion fails

element() → retrieves head, throws exception if empty

peek() → retrieves head, returns null if empty

remove() → removes head, throws exception if empty

poll() → removes head, returns null if empty

# Deque
A Deque (Double-Ended Queue) allows insertion and removal at both ends.
It can act as both a queue (FIFO) and a stack (LIFO).

Common Implementations:

LinkedList

ArrayDeque

Methods:

addFirst(), addLast()

offerFirst(), offerLast()

removeFirst(), removeLast()

pollFirst(), pollLast()

peekFirst(), peekLast()

push() → add at front (stack behavior)

pop() → remove from front (stack behavior)

# Stack (via Deque)
Stack is a LIFO (Last-In-First-Out) data structure.
In modern Java, ArrayDeque is preferred over Stack class.

Methods:

push() → add element on top

pop() → remove and return top element

peek() → return top element without removing

# PriorityQueue
A PriorityQueue orders elements according to their priority.
By default, it is a min-heap (smallest element has highest priority).

Key Points:

Printing the queue does not show sorted order, only internal heap structure.

Use poll() repeatedly to retrieve elements in sorted order.

Can be turned into a max-heap using a comparator:

java
Queue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

# Set
A Set is a collection that stores unique elements (no duplicates).

Common Implementations:

HashSet → random ordering, O(1) access

LinkedHashSet → preserves insertion order, O(n) access

TreeSet → sorted order, O(log n) access

Methods:

add() → adds element (duplicates ignored)

retainAll() → intersection of sets

containsAll() → subset check

Custom Objects in Set
When storing custom objects (like Student) in a Set, you must override equals() and hashCode() to ensure duplicates are recognized.

Example:

java
@Override
public boolean equals(Object o) { ... }

@Override
public int hashCode() { ... }
Without these overrides, two Student objects with the same data will be treated as different because the default equals() compares memory addresses.

# Map
elements are stored in key value pair
contains unique keys, each key is associated with a single value
can be implemented using hashmap, treemap, linkedhashmap, hashtable
doesn't maintain any ordering
allows null values
hashmap allows one null key but hashtable doesnot