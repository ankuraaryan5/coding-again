public class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student[rollNo=" + rollNo + ", name=" + name + "]";
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
}
