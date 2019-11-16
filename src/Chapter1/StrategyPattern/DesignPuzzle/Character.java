package Chapter1.StrategyPattern.DesignPuzzle;

public abstract class Character {
    WeaponBehaviour weaponBehaviour;
    Character(){
    }
    public void fight(){
        weaponBehaviour.useWeapon();
    }
    public void setWeaponBehaviour(WeaponBehaviour wb){
        weaponBehaviour = wb;
    }
    public abstract void display();

}
