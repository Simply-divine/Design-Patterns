package Chapter1.StrategyPattern;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    public abstract void display();

    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }
    public void setQuackBehaviour(QuackBehaviour qk){
        quackBehaviour = qk;
    }

    public void performFly(){ flyBehaviour.fly(); }
    public void performQuack(){
        quackBehaviour.quack();
    }
    public void swim(){
        System.out.println("I am swimming");
    }

}
