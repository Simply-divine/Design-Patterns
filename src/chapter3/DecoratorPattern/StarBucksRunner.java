package chapter3.DecoratorPattern;

import chapter3.DecoratorPattern.Beverages.Expresso;
import chapter3.DecoratorPattern.Beverages.HouseBlend;
import chapter3.DecoratorPattern.Condiments.Mocha;
import chapter3.DecoratorPattern.Condiments.Soy;
import chapter3.DecoratorPattern.Condiments.Whip;

public class StarBucksRunner {
    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription() + ", $" + beverage.cost());
        Beverage beverage1 = new HouseBlend();
        // Adding toppings to the beverage at runtime
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new Soy(beverage1);
        // 0.99 + 0.25 + 0.33 + 0.19
        System.out.println(beverage1.getDescription() + ", $" + beverage1.cost());
    }
}
