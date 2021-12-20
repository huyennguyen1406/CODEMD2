package Btvn3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);

        Animal animal1 = new Animal("Cat", 2, 2.5);
        Animal animal2 = new Animal("Dog", 3, 10);
        Animal animal3 = new Animal("Mouse", 1, 0.5);

        Set<Animal> animals = new HashSet<Animal>();
        animals.add(animal3);
        animals.add(animal2);
        animals.add(animal1);

        for (Animal animal: animals) {
            System.out.println(animal.toString());
        }

        int choice;
        do {
            System.out.println("---MENU---");
            System.out.println("1. Them con vat: ");
            System.out.println("2. Xoa 1 con vat: ");
            System.out.println("3. Sua con vat: ");
            System.out.println("4. Hien thi thong tin con vat: ");
            System.out.println("5. Thong tin con vat la: ");
            System.out.println("6. Thong tin con cho la: ");
            System.out.println("7. Tat ca con vat trong khoang can nang: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    manager.displayAll();
                    break;
            }
        } while (choice != 0);
    }
}
