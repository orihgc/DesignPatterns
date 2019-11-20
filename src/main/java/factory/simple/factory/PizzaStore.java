package factory.simple.factory;

public class PizzaStore {
    SimpleFactory simpleFactory;

    public PizzaStore(SimpleFactory simpleFactory){
        this.simpleFactory=simpleFactory;
    }

    public Pizza OrderPizza(String type) {
        Pizza pizza = null;
/*        if (type.equals("Cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("Greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("Pepperoni")) {
            pizza = new PepperoniPizza();
        }*/
        pizza=simpleFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
