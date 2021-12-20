package Btvn3;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Manager {
    private Set<Animal> animals;
    Scanner scanner = new Scanner(System.in);

    public Manager(){
        this.animals = new HashSet<Animal>();
    }

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

    public void addAnimal(int choice) {
        animals.add(createAnimal(scanner, choice));
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

    public void displayAnimalOfDog(){
        System.out.println("Tat ca so cho la: ");;
        for (Animal animal : animals) {
            if (animal instanceof Dog){
                System.out.println(animal);
            }
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
            return new Animal();
        } else if (choice == 2) {
            System.out.println("Nhap can nang: ");
            double weight = scanner.nextDouble();
            return new Animal(name, age, weight);
        }
        return null;
    }
}
