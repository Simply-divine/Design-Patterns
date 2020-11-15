package chapter3.DecoratorPattern.Condiments;

import chapter3.DecoratorPattern.Beverage;
import chapter3.DecoratorPattern.CondimentDecorator;

public class Mocha implements CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.25;
    }
}
