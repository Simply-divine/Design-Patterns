package chapter3.DecoratorPattern.Condiments;

import chapter3.DecoratorPattern.Beverage;
import chapter3.DecoratorPattern.CondimentDecorator;

public class Whip implements CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.19;
    }
}
