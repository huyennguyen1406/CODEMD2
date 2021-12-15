package StudentManager;

import java.util.Arrays;
import java.util.Comparator;
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

    public void displayStudent() {
        for (Student student : students) {
            boolean compareByNull = student != null;
            if (compareByNull) {
                System.out.println(student);
            }
        }
    }

    public void displayMaxGpa() {
        double maxGpa = students[0].getGpa()  ;
        Student s = students[0];
        for (Student student : students) {
            if (student != null && student.getGpa() > maxGpa) {
                maxGpa = student.getGpa();
                s = student;
            }
        }
        System.out.println(s);
        System.out.println("---------------");
    }

    public void displayMinGpa() {
        double minGpa = students[0].getGpa();
        Student s = students[0];
        for (Student student : students) {
            if (student != null && student.getGpa() < minGpa) {
                minGpa = student.getGpa();
                s = student;
            }
        }
        System.out.println(s);
        System.out.println("---------------");
    }

    public void displayByGender(String gender) {
        for (Student student : students) {
            if (student != null && student.getGender().equals(gender)) {
                System.out.println(student);
            }
        }
        System.out.println("---------------");
    }

    public void searchByName(String name) {
        for (Student student : students) {
            if (student != null && student.getName().equals(name)) {
                System.out.println(student);
            }
        }
        System.out.println("---------------");
    }

    public void addStudent(Student student) {
        if (index == students.length) {
            students = Arrays.copyOf(students, students.length * 2);
        }
        students[index] = student;
        index++;
        System.out.println("Thêm thành công!");
        System.out.println("---------------");
    }

    public void deleteStudent(String name) {
        int index = 0;
        Student[] studentList = new Student[students.length];
        for (Student student : students) {
            if (student != null && !student.getName().equals(name)) {
                studentList[index] = student;
                index++;
            }
        }
        students = studentList;
        System.out.println("Xóa thành công!");
        System.out.println("---------------");
    }

    public void sortByGpa() {
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1 != null && o2 != null) {
                    if (o1.getGpa() < o2.getGpa()) {
                        return -1;
                    } else if (o1.getGpa() > o2.getGpa()) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Sắp xếp thành công!");
        System.out.println("---------------");
    }

}
