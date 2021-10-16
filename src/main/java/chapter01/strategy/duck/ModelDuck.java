package chapter01.strategy.duck;

import chapter01.strategy.fly.FlyNoWay;
import chapter01.strategy.quack.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    
    public void display() {
        System.out.println("저는 모형오리입니다");
    }
}
