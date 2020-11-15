package Chapter1.StrategyPattern.DesignPuzzle;

public class Game {
    public static void main(String[] args) {
        Character ch = new King();
        ch.fight();
        ch.display();
        ch.setWeaponBehaviour(new AxeBehaviour());
        ch.fight();
        ch = new Queen();
        ch.display();
        ch.fight();
        ch.setWeaponBehaviour(new BowAndArrowBehaviour());
        ch.fight();
    }
}
