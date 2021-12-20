package Btvn3.model;

import Btvn3.myInterface.AnimalMethod;

public class Cat extends Animal implements AnimalMethod {

    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Cat() {
    }

    @Override
    public int run() {
        return 30;
    }

    @Override
    public String makeSound() {
        return "Meow meow";
    }

    public void display() {
        System.out.printf("%-20s", "Cat");
        System.out.printf("%-20S", super.getName());
        System.out.printf("%-20s", super.getAge());
        System.out.printf("%s", super.getWeight());
        System.out.println();
    }
}
