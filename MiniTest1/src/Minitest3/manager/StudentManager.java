package Minitest3.manager;

import Minitest3.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Student createStudent() {
        System.out.println("Nhập họ tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Nhập điểm Toán: ");
        double math = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập điểm Lý: ");
        double phys = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập điểm Hóa: ");
        double chem = scanner.nextDouble();
        scanner.nextLine();
        return new Student(name, age, math, phys, chem);
    }

    public boolean addStudent (Student student) {
        return students.add(student);
    }

    public Student updateStudent(int id) {
        Student student = null;
        for (Student s : students) {
            if (s.getId() == id) {
                student = s;
            }
        }
        if (student != null) {
            int index = students.indexOf(student);
            System.out.println("Nhập tên mới: ");
            String name = scanner.nextLine();
            student.setName(name);
            System.out.println("Nhập tuổi mới: ");
            int age = scanner.nextInt();
            student.setAge(age);
            System.out.println("Nhập điểm Toán mới: ");
            double math = scanner.nextDouble();
            student.setMathPoint(math);
            System.out.println("Nhập điểm Lý mới: ");
            double phys = scanner.nextDouble();
            student.setPhysPoint(phys);
            System.out.println("Nhập điểm Hóa mới: ");
            double chem = scanner.nextDouble();
            student.setChemPoint(chem);
            scanner.nextLine();
            students.set(index, student);
        }
        return student;
    }

    public Student deleteStudent(int id) {
        Student student = null;
        for (Student s : students) {
            if (s.getId() == id) {
                student = s;
            }
        }
        if (student != null) {
            students.remove(student);
        }
        return student;
    }

    public Student searchById(int id) {
        Student student = null;
        for (Student s : students) {
            if (s.getId() == id) {
                student = s;
            }
        }
        return student;
    }
    public ArrayList<Student> getStudentsByMaxPoint() {
        ArrayList<Student> studentsMax = new ArrayList<>();
        double avg = students.get(0).getAvgPoint();
        for (Student s : students) {
            if (s.getAvgPoint() > avg) {
                avg = s.getAvgPoint();
            }
        }
        for (Student s : students) {
            if (s.getAvgPoint() == avg) {
                studentsMax.add(s);
            }
        }
        return studentsMax;
    }

    public ArrayList<Student> sortByAvgPoint() {
        students.sort((o1, o2) -> Double.compare(o2.getAvgPoint(), o1.getAvgPoint()));
        return students;
    }
}
