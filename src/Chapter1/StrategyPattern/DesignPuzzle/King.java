package Chapter1.StrategyPattern.DesignPuzzle;

public class King extends Character{
    King(){
        weaponBehaviour = new SwordBehaviour();
    }
    @Override
    public void display() {
        System.out.println("I am the king");
    }
}
