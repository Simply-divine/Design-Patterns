package Chapter1.StrategyPattern.DesignPuzzle;

public class Troll extends Character {
    Troll(){
        weaponBehaviour = new AxeBehaviour();
    }
    @Override
    public void display() {
        System.out.println("I am troll");
    }
}
