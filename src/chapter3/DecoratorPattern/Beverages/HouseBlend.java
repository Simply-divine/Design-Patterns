package chapter3.DecoratorPattern.Beverages;

import chapter3.DecoratorPattern.Beverage;

public class HouseBlend implements Beverage {
    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
