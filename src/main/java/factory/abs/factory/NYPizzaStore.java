package factory.abs.factory;

public class NYPizzaStore extends PizzaStore{
    Pizza createPizza(String type) {
        Pizza pizza=null;
        NYPizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("Cheese")){
            pizza=new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if(type.equals("Clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}
