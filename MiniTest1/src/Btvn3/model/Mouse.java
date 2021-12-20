package Btvn3.model;

import Btvn3.myInterface.AnimalMethod;

public class Mouse extends Animal implements AnimalMethod {

    public Mouse(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Mouse() {
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return "Chit chit";
    }

    public void display() {
        System.out.printf("%-20s", "Mouse");
        System.out.printf("%-20S", super.getName());
        System.out.printf("%-20s", super.getAge());
        System.out.printf("%s", super.getWeight());
        System.out.println();
    }
}
