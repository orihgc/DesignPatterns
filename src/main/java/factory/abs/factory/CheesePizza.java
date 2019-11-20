package factory.abs.factory;

public class CheesePizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory=pizzaIngredientFactory;
    }

    void prepare() {
        System.out.println("Preparing"+name);
        dough = pizzaIngredientFactory.createDough();
    }
}
