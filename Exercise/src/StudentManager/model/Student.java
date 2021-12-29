package StudentManager.model;

public class Student extends Human{
    private double gpa;

    public Student() {
    }

    public Student(String name, int age, String gender, String address, double gpa) {
        super(name, age, gender, address);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "gpa=" + gpa +
                '}';
    }
}
