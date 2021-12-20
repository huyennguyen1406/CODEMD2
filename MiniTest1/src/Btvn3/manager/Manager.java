package Btvn3.manager;


import Btvn3.model.Animal;
import Btvn3.model.Cat;
import Btvn3.model.Dog;
import Btvn3.model.Mouse;

import java.util.*;

public class Manager {

    HashMap<String, Animal> animals = new HashMap<>();
    Scanner scanner = new Scanner(System.in);



    public boolean addAnimal(int choice) {
        System.out.println("Tên mới: ");
        String name    = scanner.nextLine();
        System.out.println("Tuổi mới: ");
        int age = scanner.nextInt();
        System.out.println("Cân nặng mới: ");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        switch (choice) {
            case 1:
                Animal animal = new Animal(name, age, weight);
                return checkNameOfAnimal(animal);
            case 2:
                Dog dog = new Dog(name, age, weight);
                return checkNameOfAnimal(dog);
            case 3:
                Cat cat = new Cat(name, age, weight);
                return checkNameOfAnimal(cat);
            case 4:
                Mouse mouse = new Mouse(name, age, weight);
                return checkNameOfAnimal(mouse);
        }
        return false;
    }

    private boolean checkNameOfAnimal (Animal animal) {
        HashSet<String> strings = new HashSet<>(animals.keySet());
        if (strings.add(animal.getName())) {
            animals.put(animal.getName(), animal);
            return true;
        } else {
            return false;
        }
    }

    public Animal deleteAnimal(String name) {
        return animals.remove(name);
    }

    public Animal updateAnimal(String editName) {
        Animal animal = animals.get(editName);
        if (animal != null) {
            System.out.println("Tên con mới: ");
            String name = scanner.nextLine();
            System.out.println("Tuổi mới: ");
            int age = scanner.nextInt();
            System.out.println("Cân nặng mới: ");
            double weight = scanner.nextDouble();
            scanner.nextLine();
            animal.setName(name);
            animal.setAge(age);
            animal.setWeight(weight);
            animals.remove(editName);
            animals.put(name, animal);
        }
        assert animal != null;
        return animals.get(animal.getName());
    }

    public void displayAnimal(String name) {
        animals.get(name).display();
    }

    public void displayAllAnimal() {
        for (Animal animal : animals.values()) {
            animal.display();
        }
    }

    public ArrayList<Dog> displayAllDog() {
        ArrayList<Dog> dogs = new ArrayList<>();
        for (Animal animal : animals.values()) {
            if (animal instanceof Dog) {
                dogs.add((Dog) animal);
            }
        }
        return dogs;
    }

    public ArrayList<Animal> listAnimalByWeight(double weightDown, double weightUp) {
        ArrayList<Animal> animalList = new ArrayList<>();
        for (Animal animal : animals.values()) {
            boolean checkWeight = animal.getWeight() > weightDown && animal.getWeight() < weightUp;
            if (checkWeight) {
                animalList.add(animal);
            }
        }
        return animalList;
    }
}
