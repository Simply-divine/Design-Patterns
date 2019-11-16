package Chapter1.StrategyPattern.DesignPuzzle;

public class SwordBehaviour implements WeaponBehaviour{

    @Override
    public void useWeapon() {
        System.out.println("Sword gives the strength of a ninja");
    }
}
