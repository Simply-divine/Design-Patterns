package Chapter1.StrategyPattern.DesignPuzzle;

public class AxeBehaviour implements WeaponBehaviour{

    @Override
    public void useWeapon() {
        System.out.println("Axe will slice the enemy");
    }
}
