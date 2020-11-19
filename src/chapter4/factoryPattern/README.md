# Understanding the meaning of designing to an interface instead of an implementation


* When we create an object of an interface and instantiate it with constructor of a concrete class, we are essentially making our design open for modification. **But we know that design patterns should be closed for modifications.**

* Let's say we have orderPizza method in Pizza class:
    
  ```
  Pizza orderPizza(string type){
        Pizza pizza;
        if(type =="CheesePizza"){
            pizza = new CheesePizza();
        }
        else if(type == "margerita"){
            pizza = new Margerita();
        }
        ...
  
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.pack();
        return pizza;
  } 
  ```


* If we add a new Pizza type we would have to modify our base class.

* What is changing everytime in this code? Yes, the if block.

**Encapsulate what varies**.

We will create a new Object. We are gonna call this as factory.