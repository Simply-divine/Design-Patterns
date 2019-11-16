package Chapter1.StrategyPattern;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I do quack..");
    }
}
