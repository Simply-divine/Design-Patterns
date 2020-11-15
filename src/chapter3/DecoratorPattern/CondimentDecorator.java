package chapter3.DecoratorPattern;

public interface CondimentDecorator extends Beverage {
    @Override
    String getDescription();

    @Override
    double cost();
}
