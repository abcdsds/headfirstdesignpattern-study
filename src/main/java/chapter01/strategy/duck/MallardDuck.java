package chapter01.strategy.duck;

import chapter01.strategy.fly.FlyWithWings;
import chapter01.strategy.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("저는 물오리 입니다.");
    }
}
