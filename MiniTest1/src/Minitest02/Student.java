package Minitest02;

public class Student extends Person{
    private double gpa;

    public Student() {
    }

    public Student(int id, String name, int age, double gpa) {
        super(id, name, age);
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
        return "Student{" +  super.toString() +
                "gpa=" + gpa +
                '}';
    }
}
