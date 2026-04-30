package  Collections;
public class Student implements Comparable <Student>{
    private int rollNo;
    private String name;
    public int weight;
    public Student(int rollNo, String name, int weight) {
        this.rollNo = rollNo;
        this.name = name;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Student[rollNo=" + rollNo + ", name= " + name + ", weight= "+weight+ "\"]";
    }
    // [Student[rollNo=1, name=Ankur], Student[rollNo=1, name=Ankur], Student[rollNo=1, name=Ankur]]
    // we have to override equals and hashcode for saving it uniquely
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true; // same reference
        if (o == null || getClass() != o.getClass())
            return false; // type check

        Student student = (Student) o; // safe cast
        return rollNo == student.rollNo && // compare rollNo
                (name != null ? name.equals(student.name) : student.name == null); // compare name
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(rollNo); // hash for rollNo
        result = 31 * result + (name != null ? name.hashCode() : 0); // combine with name
        return result;
    }
    // [Student[rollNo=1, name=Ankur]]

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    // Implement Comparable
    @Override
    public int compareTo(Student that) {
        // Example: sort by rollNo
        if (this.rollNo==that.rollNo) {
            this.name.compareTo(that.name);
        }
        return that.rollNo-this.rollNo;
    }
}
