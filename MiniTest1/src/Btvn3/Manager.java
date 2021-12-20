package Btvn3;

import com.sun.org.apache.xerces.internal.xs.XSNamespaceItemList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.function.ToIntFunction;

public class Manager {
    private Set<Animal> animals = new HashSet<>();
    private static int index = 0;

    public Manager (Set<Animal> animals) {
        this.animals = animals;
    }

    public void displayAll() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
            }
        }
    }

    public void addAnimal(Animal animal) {
        if (index == animals.size()) {
        }
        index++;
        System.out.println("Them thanh cong");
    }

    public void deleteAnimal(String name) {
        int index = 0;
        Animal[] animalList = new Animal[animals.size()];
        for (Animal animal : animals) {
            if (animal != null && !animal.getName().equals(name)) {
                animalList[index] = animal;
                index++;
            }
        }
    }

    public void rangeWeight(double minWeight, double maxWeight) {
        boolean check = false;
        System.out.println("Cac con vat trong khoang can nang la: ");
        for (Animal animal : animals) {
            boolean betweenTwoWeight = animal.getWeight() >= minWeight && animal.getWeight() <= maxWeight;
            if (betweenTwoWeight) {
                check = true;
                System.out.println(animal);
            }
        }
        if (!check) {
            System.out.println("khong co con vat phu hop");
        }
    }

    public void searchByName(String searchName) {
        boolean check = false;
        for (Animal animal : animals) {
            if (animal != null) {
                if (((Animal)animal).getName().equals(searchName)) {
                    check= true;
                    System.out.println(animal);
                }
            }
        }
        if (!check) {
            System.out.println("Khong ton tai");
        }
    }

    public Animal createAnimal(Scanner scanner, int choice) {
        scanner.nextLine();
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1) {
            return new Animal(name, age);
        } else if (choice == 2) {
            System.out.println("Nhap can nang: ");
            double weight = scanner.nextDouble();
            return new Animal(name, age, weight);
        }
        return null;
    }
}
