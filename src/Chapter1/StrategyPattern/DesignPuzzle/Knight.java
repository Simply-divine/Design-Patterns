package Chapter1.StrategyPattern.DesignPuzzle;

public class Knight extends Character {
    Knight(){
        weaponBehaviour = new BowAndArrowBehaviour();
    }
    @Override
    public void display() {
        System.out.println("I am a Knight");
    }
}
