package strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        Duck modelDuck=new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRockedPowered());
        modelDuck.performFly();
    }
}
