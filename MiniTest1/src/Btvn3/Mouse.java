package Btvn3;

public class Mouse extends Animal implements AnimalMethod{
    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return "Chit chit";
    }

    @Override
    public String toString() {
        return "Mouse{" + super.toString() + "}";
    }
}
