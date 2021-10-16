package chapter01.strategy.inheritance;

public class Dog extends Animal {
    @Override
    void makeSound() {
        bark();
    }
    
    void bark() {
        System.out.println("멍멍");
    }
}
