package Chapter1.StrategyPattern;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I an squeaking");
    }
}
