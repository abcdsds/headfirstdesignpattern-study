package chapter01.strategy;

import chapter01.strategy.duck.Duck;
import chapter01.strategy.duck.MallardDuck;
import chapter01.strategy.duck.ModelDuck;
import chapter01.strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
