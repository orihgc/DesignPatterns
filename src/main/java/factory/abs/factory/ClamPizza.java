package factory.abs.factory;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory=pizzaIngredientFactory;
    }

    void prepare() {
        System.out.println("Preparing"+name);
        dough = pizzaIngredientFactory.createDough();
    }
}
