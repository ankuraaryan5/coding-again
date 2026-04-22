# Abstract Class vs Interface in Java

## 📖 Introduction
In Java, **abstraction** is the process of hiding implementation details and exposing only the essential features.  
Two primary ways to achieve abstraction are:
- **Abstract Classes**
- **Interfaces**

Both serve as contracts for classes, but they differ in design philosophy and usage.

---

## 🟦 Abstract Class

### Key Features
- Can contain **abstract methods** (no body) and **concrete methods** (with body).
- Can have **instance variables** and **constructors**.
- Supports **single inheritance** (a class can extend only one abstract class).
- Useful when classes share a **common base** with default behavior.

### Example
```java
abstract class Bird {
    abstract void fly();
    abstract void eat();

    public void sleep() {
        System.out.println("Bird is sleeping");
    }
}

class Sparrow extends Bird {
    void fly() { System.out.println("Sparrow is flying"); }
    void eat() { System.out.println("Sparrow is eating"); }
}
🟩 Interface
Key Features
Defines a contract: all methods are implicitly public and abstract (unless marked default or static).

Cannot have instance variables (only public static final constants).

Supports multiple inheritance (a class can implement multiple interfaces).

Useful when classes are unrelated but share common behavior.

Example
java
interface Bird {
    void fly();
    void eat();

    default void sleep() {
        System.out.println("Bird is sleeping");
    }
}

class Crow implements Bird {
    public void fly() { System.out.println("Crow is flying"); }
    public void eat() { System.out.println("Crow is eating something spicy"); }
}
🔑 Differences Between Abstract Class and Interface
Feature	Abstract Class	Interface
Methods	Abstract + Concrete	Abstract (default/static allowed)
Variables	Instance + Static	Only public static final
Constructors	Allowed	Not allowed
Inheritance	Single (extends)	Multiple (implements)
Use Case	Common base with shared logic	Contract for unrelated classes


✅ When to Use
Abstract Class → Use when you want to provide a base class with partial implementation and shared state.

Interface → Use when you want to define a contract that multiple unrelated classes can implement.

📌 Summary
Abstract classes are best for hierarchical relationships (is-a).

Interfaces are best for capabilities (can-do).

Modern Java (8+) allows interfaces to have default and static methods, making them more flexible than before.

🐦 Bird Example Side-by-Side
Abstract Class Version
java
abstract class Bird {
    abstract void fly();
    abstract void eat();
    public void sleep() { System.out.println("Bird is sleeping"); }
}

class Sparrow extends Bird {
    void fly() { System.out.println("Sparrow is flying"); }
    void eat() { System.out.println("Sparrow is eating"); }
}
Interface Version
java
interface Bird {
    void fly();
    void eat();
    default void sleep() { System.out.println("Bird is sleeping"); }
}

class Crow implements Bird {
    public void fly() { System.out.println("Crow is flying"); }
    public void eat() { System.out.println("Crow is eating something spicy"); }
}
🚀 Final Note
Use abstract classes when you want to share code and state across related classes.

Use interfaces when you want to define a contract that can be applied across unrelated classes.