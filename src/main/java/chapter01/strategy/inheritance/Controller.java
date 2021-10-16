package chapter01.strategy.inheritance;

public class Controller {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        d.bark();

        Animal animal = new Dog();
        animal.makeSound();


    }
}
