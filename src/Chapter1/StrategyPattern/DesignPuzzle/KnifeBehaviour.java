package Chapter1.StrategyPattern.DesignPuzzle;

public class KnifeBehaviour implements WeaponBehaviour {

    @Override
    public void useWeapon() {
        System.out.println("Knife cuts the enimies ino two....");
    }
}
