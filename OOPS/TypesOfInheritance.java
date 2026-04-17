// ======================================================
// JAVA INHERITANCE USING EMPLOYEE - MANAGER RELATIONSHIP
// Covers:
// 1. Single Inheritance
// 2. Multilevel Inheritance
// 3. Hierarchical Inheritance
// ======================================================


// ================= BASE CLASS =================
class Employee {

    String name;
    int empId;
    double salary;

    Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " is working.");
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}


// ======================================================
// 1. SINGLE INHERITANCE
// Manager inherits Employee
// ======================================================

class Manager extends Employee {

    int teamSize;

    Manager(String name, int empId, double salary, int teamSize) {
        super(name, empId, salary);
        this.teamSize = teamSize;
    }

    void conductMeeting() {
        System.out.println(name + " is conducting a meeting.");
    }
}


// ======================================================
// 2. MULTILEVEL INHERITANCE
// Employee -> Manager -> SeniorManager
// ======================================================

class SeniorManager extends Manager {

    String region;

    SeniorManager(String name, int empId, double salary,
                  int teamSize, String region) {

        super(name, empId, salary, teamSize);
        this.region = region;
    }

    void approveBudget() {
        System.out.println(name + " approved budget for " + region);
    }
}


// ======================================================
// 3. HIERARCHICAL INHERITANCE
// Developer and HR inherit Employee
// ======================================================

class Developer extends Employee {

    String language;

    Developer(String name, int empId, double salary, String language) {
        super(name, empId, salary);
        this.language = language;
    }

    void code() {
        System.out.println(name + " is coding in " + language);
    }
}


class HR extends Employee {

    HR(String name, int empId, double salary) {
        super(name, empId, salary);
    }

    void hire() {
        System.out.println(name + " is hiring new employees.");
    }
}



// ======================================================
// MAIN CLASS
// File name: TypesOfInheritance.java
// ======================================================

public class TypesOfInheritance {

    public static void main(String[] args) {

        System.out.println("----- Single Inheritance -----");
        Manager m = new Manager("Ankur", 101, 60000, 8);
        m.showDetails();
        m.work();
        m.conductMeeting();


        System.out.println("\n----- Multilevel Inheritance -----");
        SeniorManager sm =
            new SeniorManager("Rohit", 102, 95000, 20, "East Zone");

        sm.showDetails();
        sm.conductMeeting();
        sm.approveBudget();


        System.out.println("\n----- Hierarchical Inheritance -----");
        Developer d =
            new Developer("Priya", 103, 70000, "Java");

        HR h =
            new HR("Neha", 104, 50000);

        d.work();
        d.code();

        h.work();
        h.hire();
    }
}