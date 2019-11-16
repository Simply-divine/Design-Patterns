package Chapter1.StrategyPattern;

public class DuckApp {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.setFlyBehaviour(new FlyWithWings());
        mallardDuck.setQuackBehaviour(new MuteQuack());
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
