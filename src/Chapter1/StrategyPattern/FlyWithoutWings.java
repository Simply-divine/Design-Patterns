package Chapter1.StrategyPattern;

public class FlyWithoutWings implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("I fly without wings");
    }
}
