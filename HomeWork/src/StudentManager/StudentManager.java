package StudentManager;

import java.util.Scanner;

public class StudentManager {
    public Student[] students;
    public static int index = 0;
    public int id = 1;

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

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        StudentManager.index = index;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addStudent(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Enter full name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();

        students[index] = new Student(name, age, gender, address, gpa, id);
        index++;
        id++;
    }

    public void displayAllStudent() {
        for (Student student : students) {
            boolean compareByNull = student != null;
            if (compareByNull) {
                System.out.println(student);
            }
        }
    }

    public void findMaxGpa() {
        double maxGpa = students[0].getGpa();
        for (Student student : students) {
            if (student != null && maxGpa < student.getGpa()) {
                maxGpa = student.getGpa();
            }
        }
        for (Student student : students) {
            if (student != null && maxGpa == student.getGpa()) {
                System.out.println(student);
            }
        }
    }

    public void findMinGpa() {
        double minGpa = students[0].getGpa();
        for (Student student : students) {
            if (student != null && minGpa > student.getGpa()) {
                minGpa = student.getGpa();
            }
        }
        for (Student student : students) {
            if (student != null && minGpa == student.getGpa()) {
                System.out.println(student);
            }
        }
    }

}
