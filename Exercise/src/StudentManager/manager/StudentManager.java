package StudentManager.manager;

import StudentManager.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static final String PATH_NAME = "src/StudentManager/students.csv";

    private final ArrayList<Student> students;
    private final Scanner scanner = new Scanner(System.in);

    public StudentManager() {
        this.students = readFile(PATH_NAME);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public boolean checkAgeAndGpa(int age, double gpa) {
        return (age >= 18 && age <= 60 && !(gpa < 0) && !(gpa > 10));
    }

    public String getGenderByChoice(int choice) {
        String gender = "";
        switch (choice) {
            case 1:
                gender = "Male";
                break;
            case 2:
                gender = "Female";
                break;
            case 3:
                gender = "Other";
                break;
        } return gender;
    }



    public Student addStudent() {
        System.out.println("Nhap ho ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Chon gioi tinh: ");
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.println("3. Other");
        System.out.println("Nhap lua chon: ");
        int gender = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.println("Nhap diem trung binh: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();
        if (checkAgeAndGpa(age, gpa) && !getGenderByChoice(gender).equals("")) {
            students.add(new Student(name, age, getGenderByChoice(gender), address, gpa));
            writeFile(students, PATH_NAME);
            System.out.println("Them sinh vien co ten = " + name + " thanh cong!");
        } else {
            System.out.println("Thong tin khong hop le, moi nhap lai!");
        }
        return new Student(name, age, getGenderByChoice(gender), address, gpa);
    }

    public Student editStudent(String name) {
        Student editStudent = null;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                editStudent = student;
            }
        }
        if (editStudent != null) {
            int index = students.indexOf(editStudent);
            System.out.println("Nhập tên mới: ");
            editStudent.setName(scanner.nextLine());
            System.out.println("Nhập tuổi mới: ");
            editStudent.setAge(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Nhap gioi tinh: ");
            System.out.println("1. Male");
            System.out.println("2. Female");
            System.out.println("3. Other");
            System.out.println("Nhap lua chon: ");
            int gender = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhap dia chi moi: ");
            editStudent.setAddress(scanner.nextLine());
            System.out.println("Nhap diem trung binh moi: ");
            editStudent.setGpa(scanner.nextDouble());
            scanner.nextLine();
            if (checkAgeAndGpa(editStudent.getAge(), editStudent.getGpa()) && !getGenderByChoice(gender).equals("")){
                editStudent.setGender(getGenderByChoice(gender));
                students.set(index, editStudent);
                writeFile(students, PATH_NAME);
                System.out.println("Sua thong tin ten = " + name + " thanh cong!");
            } else {
                System.out.println("Thong tin khong hop le, moi kiem tra lai");
            }
        }
        return editStudent;
    }

    public Student deleteStudent(String name) {
        Student editStudent = null;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                editStudent = student;
            }
        }
        if (editStudent != null) {
            students.remove(editStudent);
            writeFile(students, PATH_NAME);
            System.out.println("Xoa sinh vien co ten = " + name + " thanh cong!");
        }
        return editStudent;
    }

    public void displayAll(){
        if (students.isEmpty()) {
            System.out.println("Danh sach sinh vien trong");
            return;
        }
        for (Student student: students) {
            System.out.println(student);
        }
    }

    public void displayStudentByGpa(){
        if (students.isEmpty()) {
            System.out.println("Danh sach sinh vien trong!");
            return;
        }
        for (Student student : students) {
            if(student.getGpa() > 7.5){
                System.out.println(student);;
            }
        }
    }

    public void displayStudentFormat() {
        if (students.isEmpty()) {
            System.out.println("Danh sach sinh vien trong");
            return;
        }
        for (Student student : students) {
            if (student.getGpa() > 8.0) {
                System.out.println(student.getName() + " - " + student.getGpa() + " - " + "Good");
            } else if (student.getGpa() > 6.0) {
                System.out.println(student.getName() + " - " + student.getGpa() + " - " + "Pretty");
            }else if (student.getGpa() > 4.0) {
                System.out.println(student.getName() + " - " + student.getGpa() + " - " + "Normal");
            } else {
                System.out.println(student.getName() + " - " + student.getGpa() + " - " + "Weak");
            }
        }
    }

    public void writeFile(ArrayList<Student> students, String path) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Student student : students) {
                bufferedWriter.write(student.getName() + "," + student.getAge() + "," + student.getGender() + "," + student.getAddress() + "," + student.getGpa() + "\n");
            }
            bufferedWriter.close();
            System.out.println("Write file thanh cong");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public ArrayList<Student> readFile(String path) {
        ArrayList<Student> students = new ArrayList<>();
        File file = new File(PATH_NAME);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                students.add(new Student(strings[0], Integer.parseInt(strings[1]), strings[2], strings[3], Double.parseDouble(strings[4])));
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return students;
    }

}
