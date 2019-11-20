package factory.simple.factory;

public class SimpleFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("Cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("Greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("Pepperoni")) {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
