package chapter3.DecoratorPattern.Beverages;

import chapter3.DecoratorPattern.Beverage;

public class DarkRoast implements Beverage {
    @Override
    public String getDescription() {
        return "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
