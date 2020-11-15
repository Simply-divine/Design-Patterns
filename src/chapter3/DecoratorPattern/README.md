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
Decorator adds it own behaviour to the base class.


