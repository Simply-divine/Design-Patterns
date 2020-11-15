package chapter3.DecoratorPattern.Beverages;

import chapter3.DecoratorPattern.Beverage;

public class Decaf implements Beverage {
    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public double cost() {
        return 1.50;
    }
}
