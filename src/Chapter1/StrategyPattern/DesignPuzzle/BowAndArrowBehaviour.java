package Chapter1.StrategyPattern.DesignPuzzle;

public class BowAndArrowBehaviour implements WeaponBehaviour{

    @Override
    public void useWeapon() {
        System.out.println("Bow and arrow slices distant enemies");
    }
}
