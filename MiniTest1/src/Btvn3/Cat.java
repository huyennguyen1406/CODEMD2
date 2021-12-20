package Btvn3;

public class Cat extends Animal implements AnimalMethod{
    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return null;
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString() + "}";
    }
}
