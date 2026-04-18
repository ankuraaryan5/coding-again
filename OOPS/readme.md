# Java Compilation & Packages Notes (What I Learned Today)

## Overview

Today I learned that many Java errors are not caused by logic mistakes, but by:

* Wrong folder structure
* Incorrect package usage
* Compiling from wrong directory
* Missing `public` access modifiers
* Running wrong class name

---

# 1. Single Java File (No Package)

## File:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
```

## Save As:

```text
Main.java
```

## Compile:

```bash
javac Main.java
```

## Run:

```bash
java Main
```

---

# 2. Multiple Files Same Folder (No Package)

## Example:

```text
Main.java
Car.java
Vehicle.java
```

## Compile All:

```bash
javac *.java
```

## Run:

```bash
java Main
```

## Important:

If `Main.java` uses `Car`, compile all files.

---

# 3. Using Packages

## Folder Structure:

```text
OOPS/
 └── Transport/
      Vehicle.java
      Car.java
      Main.java
```

## Each File Must Start With:

```java
package Transport;
```

## Compile From Parent Folder:

```bash
cd OOPS
javac Transport/*.java
```

## Run:

```bash
java Transport.Main
```

---

# 4. Two Packages Example

## Structure:

```text
OOPS/
 ├── Transport/
 └── Test/
```

## Compile:

```bash
cd OOPS
javac Transport/*.java Test/*.java
```

## Run:

```bash
java Test.TestMain
```

---

# 5. Package Rule

Folder name and package name must match.

## Example:

File inside:

```text
Test/TestMain.java
```

Must contain:

```java
package Test;
```

Otherwise error:

```text
wrong name: TestMain
```

---

# 6. Public Class Rule

If class is:

```java
public class TypesOfInheritance
```

Then file name must be:

```text
TypesOfInheritance.java
```

---

# 7. Access Modifiers Summary

| Modifier  | Same Class | Same Package | Subclass Other Package | Other Package |
| --------- | ---------- | ------------ | ---------------------- | ------------- |
| private   | Yes        | No           | No                     | No            |
| default   | Yes        | Yes          | No                     | No            |
| protected | Yes        | Yes          | Yes                    | No            |
| public    | Yes        | Yes          | Yes                    | Yes           |

---

# 8. Constructor Visibility

If constructor is:

```java
Vehicle()
```

(default)

Then another package cannot do:

```java
new Vehicle();
```

Need:

```java
public Vehicle()
```

---

# 9. Golden Rule

Always compile from the root folder above packages.

Example:

```bash
cd OOPS
javac Transport/*.java Test/*.java
```

---

# 10. Commands I Needed Today

```bash
cd OOPS
javac Transport/*.java Test/*.java
java Test.TestMain
```

---

# Final Learning

Most beginner Java errors come from:

* package confusion
* wrong compile location
* missing public
* wrong run command