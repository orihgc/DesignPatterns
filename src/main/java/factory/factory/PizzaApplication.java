package factory.factory;



public class PizzaApplication {
    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("Cheese");

        System.out.println("我们点了一个"+pizza.getName());
    }
}
