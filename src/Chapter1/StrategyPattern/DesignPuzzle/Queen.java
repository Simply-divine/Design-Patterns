package Chapter1.StrategyPattern.DesignPuzzle;

public class Queen extends Character {
    Queen(){
        weaponBehaviour = new KnifeBehaviour();
    }
    @Override
    public void display() {
        System.out.println("I am a Queen");
    }
}
