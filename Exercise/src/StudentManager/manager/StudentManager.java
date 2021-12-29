package StudentManager.manager;

import StudentManager.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Student createStudent() {
        System.out.println("Nhap ho ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        String gender = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.println("Nhap diem trung binh: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();
        return new Student(name, age, gender, address, gpa);
    }

    public boolean addStudent (Student student) {
        return students.add(student);
    }

    public Student updateStudent(String name) {
        Student student = null;
        for (Student s : students) {
            if (s.getName().equals(name)) {
                student = s;
            }
        }
        if (student != null) {
            System.out.println("Nhập tên mới: ");
            String name1 = scanner.nextLine();
            student.setName(name1);
            System.out.println("Nhập tuổi mới: ");
            int age = scanner.nextInt();
            student.setAge(age);
            System.out.println("Nhap gioi tinh: ");
            String gender = scanner.nextLine();
            student.setGender(gender);
            System.out.println("Nhap dia chi moi: ");
            String address = scanner.nextLine();
            student.setAddress(address);
            System.out.println("Nhap diem trung binh moi: ");
            double gpa = scanner.nextDouble();
            student.setGpa(gpa);
        }
        return student;
    }

    public Student deleteStudent(String name) {
        Student student = null;
        for (Student s : students) {
            if (s.getName().equals(name)) {
                student = s;
            }
        }
        if (student != null) {
            students.remove(student);
        }
        return student;
    }

//    public Student displayStudent() {
//        for (Student s : students) {
//            boolean compareByNull = s != null;
//            if (compareByNull) {
//                System.out.println(s);
//            }
//        }
//        return students;
//    }

    public void displayStudent(){
        students.forEach(System.out::println);
    }

    public void averagePointHigher(){
        List<Student> students = new ArrayList<>();
        for (Student s : students) {
            if(s.getGpa() >= 7.5){
                students.add(s);
            }
        }
        students.forEach(System.out::println);
    }
}
