package vidu;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Dog", 1, 10, 0.5, "Male");
        System.out.println(dog.age);
        System.out.println(dog.weight);
        System.out.println(dog.height);
        System.out.println(dog.getName());
    }

    public static void changeName(Animal animal) {
        animal.setName("Cat");
    }
}
