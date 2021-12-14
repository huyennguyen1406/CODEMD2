package StudentManager;

import java.util.Scanner;

public class StudentManager {
    private Student[] students;
    private static int index = 0;

    public StudentManager() {
    }

    public StudentManager(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(Scanner scanner, int choice, String name, int age, String gender, String address, double gpa);
    if(choice == 1)
}
