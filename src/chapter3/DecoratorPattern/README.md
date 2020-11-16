# Decorator Pattern

The example taken in the book:
* You have different type of beverages like HouseBlend, Darkroast, Decaf, etc.
* You have to add toppings of different type like milk, soy, mocha, whip.
* Cost can vary based on toppings added and the base price of the beverage.
* An important principle discussed here was:
    * **Classes should be open for extension and closed for modification.**
* If we add more new toppings or want to change price of toppings we would have to come to beverage class each time, this somehow doesn't sound right.
* We should be able to update toppings and add toppings to a beverage class at runtime. This will make our app loosely coupled.


### A word of caution: 
Don't use complex pattern for simple applications. Decorator pattern may be an overkill for simple applications.

## What is decorator pattern:
In decorator pattern, we basically wrap our original classes with decorator classes. This decorator classes have same type as the original class.
Due to this we can add decorator class to another decorator class as many times as we want.
Decorator adds its own behaviour to the base class.

## How to implement decorator pattern 
* So here we will create an abstract class Beverage. We will add some concrete components like DarkRoast, HouseBlend, Expresso, Decaf which will extend this abstract class.
* We will make a decorator interface called Condiment Decorator.
* All the decorators will implement this decorator interface and use Composition to add type of Beverage at runtime.

**Generally we use composition to get the ability to change our objects at runtime.**

## Conclusion:
 We use inheritance to make decorator of same type as of base class and composition to be able to change objects dynamically at run time.

## Real World Usecase : Java IO library
Java IO Library uses decorator pattern a lot.

![Tree Structure](https://github.com/Simply-divine/Design-Patterns/tree/master/src/chapter3/DecoratorPattern/images/JavaIOStructure.png)
