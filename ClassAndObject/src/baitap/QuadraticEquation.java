package baitap;

public class QuadraticEquation {
    private double num1;
    private double num2;
    private double num3;

    public QuadraticEquation(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public void setNum3(double num3) {
        this.num3 = num3;
    }

    public double getDiscriminant() {
        return num2 * num2 - 4 * num1 * num3;
    }
    public double getRoot1() {
        return (-num2 + Math.sqrt(getDiscriminant())) / (2 * num1);
    }
    public double getRoot2() {
        return (-num2 - Math.sqrt(getDiscriminant())) / (2 * num1);
    }
}
