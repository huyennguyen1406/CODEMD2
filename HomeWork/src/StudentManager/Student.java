package StudentManager;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String address;
    private double gpa;
    private int id;

    public Student() {
    }

    public Student(String name, int age, String gender, String address, double gpa, int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.gpa = gpa;
        this.id = id;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", gpa=" + gpa +
                ", id=" + id +
                '}';
    }
}
