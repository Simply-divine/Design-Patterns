package chapter3.DecoratorPattern.Condiments;

import chapter3.DecoratorPattern.Beverage;
import chapter3.DecoratorPattern.CondimentDecorator;

public class Soy implements CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.33;
    }
}
