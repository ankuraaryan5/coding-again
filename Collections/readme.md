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