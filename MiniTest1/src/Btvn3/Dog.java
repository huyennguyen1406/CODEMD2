package Btvn3;

public class Dog extends Animal implements AnimalMethod {

    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return "Go go";
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + "}";
    }
}
