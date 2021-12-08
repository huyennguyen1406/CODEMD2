package student;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String address;
    private double math;
    private double literature;
    private double english;

    public Student() {

    }

    public Student(String name, int age, String gender, String address, double math, double literature, double english){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.math = math;
        this.literature = literature;
        this.english = english;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getLiterature() {
        return literature;
    }

    public void setLiterature(double literature) {
        this.literature = literature;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double averagePoint() {
        return (this.math + this.literature + this.english) / 3;
    }

    public String getAverage() {
        return "Student{" +
                "name='" + name + '\'' +
                ", average='" + averagePoint() + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", Math =" + math +
                ", Literature =" + literature +
                ", English =" + english +
                '}';
    }
}
