package chapter3.DecoratorPattern.Beverages;

import chapter3.DecoratorPattern.Beverage;

public class Expresso implements Beverage {
    @Override
    public String getDescription() {
        return "Expresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
