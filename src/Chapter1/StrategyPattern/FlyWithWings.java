package Chapter1.StrategyPattern;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I am flying with wings....");
    }
}
