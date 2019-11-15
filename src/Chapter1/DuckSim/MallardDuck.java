package Chapter1.DuckSim;

public class MallardDuck extends Duck {

    MallardDuck(){
        flyBehaviour = new FlyWithoutWings();
        quackBehaviour = new Quack();
    }


    @Override
    public void display() {
        System.out.println("I am a real mallard Duck");
    }
}
