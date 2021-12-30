package Minitest4.model;

public class Student extends Human{
    private double mathPoint;
    private double physPoint;
    private double chemPoint;

    public Student(String name, int age, double mathPoint, double physPoint, double chemPoint) {
        super(name, age);
        this.mathPoint = mathPoint;
        this.physPoint = physPoint;
        this.chemPoint = chemPoint;
    }

    public double getMathPoint() {
        return mathPoint;
    }

    public void setMathPoint(double mathPoint) {
        this.mathPoint = mathPoint;
    }

    public double getPhysPoint() {
        return physPoint;
    }

    public void setPhysPoint(double physPoint) {
        this.physPoint = physPoint;
    }

    public double getChemPoint() {
        return chemPoint;
    }

    public void setChemPoint(double chemPoint) {
        this.chemPoint = chemPoint;
    }

    public double   getAvgPoint() {
        return ((mathPoint + physPoint + chemPoint) / 3);
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "mathPoint=" + mathPoint +
                ", physPoint=" + physPoint +
                ", chemPoint=" + chemPoint + ", avgPoint=" + getAvgPoint() +
                '}';
    }
}
