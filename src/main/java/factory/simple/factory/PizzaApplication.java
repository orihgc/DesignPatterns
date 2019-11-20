package factory.simple.factory;

public class PizzaApplication {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        PizzaStore pizzaStore = new PizzaStore(simpleFactory);

        Pizza pizza = pizzaStore.OrderPizza("Cheese");
        System.out.println("我们点了一个"+pizza.getName());
        pizza = pizzaStore.OrderPizza("Greek");
        System.out.println("我们点了一个"+pizza.getName());
    }
}
