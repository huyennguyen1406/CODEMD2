package Minitest3.manager;

import Minitest3.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students;
    private Scanner scanner = new Scanner(System.in);

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void displayAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student createStudent() {
        System.out.println("Nhập id: ");
        int id = scanner.nextInt();
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
        return new Student(id, name, age, math, phys, chem);
    }

    public void addStudent (Student student) {
        students.add(student);
    }

    public Student deleteStudent(int id) {
        Student student = null;
        for (Student s : students) {
            if (s.getId() == id) {
                student = s;
            }
        }
        int index = students.indexOf(student);
        return students.remove(index);
    }

    public Student editStudent(int id) {
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
            System.out.println("Nhập điểm lý mới: ");
            double phys = scanner.nextDouble();
            student.setPhysPoint(phys);
            System.out.println("Nhập điểm Hóa mới: ");
            double chem = scanner.nextDouble();
            student.setChemPoint(chem);
            students.set(index, student);
        }
        return student;
    }

    public void displayStudent(int id) {
        Student student = null;
        for (Student s : students) {
            if (s.getId() == id) {
                student = s;
            }
        }
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Không có sinh viên có id tương ứng");
        }
    }

    public void displayAvgPoint() {
        for (Student s : students) {
            System.out.println(s.getId() + " " + ((s.getMathPoint() + s.getPhysPoint() + s.getChemPoint())/3));
        }
    }

    public ArrayList<Student> studentByPoint() {
        students.sort((o1, o2) -> (int) (o1.avgPoint() - o2.avgPoint()));
        System.out.println("Danh sách điểm trung bình đã sắp xếp: ");
        return students;
    }

    public void maxAvgPoint() {
        ArrayList<Student> students1 = new ArrayList<>();

        double max = students.get(0).avgPoint();
        for (Student s : students) {
            if (max < s.avgPoint()) {
                max = s.avgPoint();
            }
        }
        for (Student s : students) {
            if (max == s.avgPoint()) {
                students1.add(s);
            }
        }
        System.out.println("Sinh viên có điểm trung bình cao nhất là:");
        for (Student s : students1) {
            System.out.println(s);
        }
    }
}
