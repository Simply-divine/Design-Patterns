package Chapter1.DuckSim;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I am mute quacking");
    }
}
