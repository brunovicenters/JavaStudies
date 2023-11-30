package pizza;

import java.util.ArrayList;

public class ShoppingCart {

    // Pizzas
    ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

    // addPizza
    public void addPizza(Pizza p) {
       if (!p.getIngredients().isEmpty()) {
           this.pizzas.add(p);
       } else {
           System.out.println("Cannot add empty pizza!");
       }
    }

    // totalPrice()
    public int totalPrice() {
        int totalPrice = 0;
        for (Pizza pizza: this.pizzas) {
            totalPrice += pizza.getPrice();
        }
        return totalPrice;
    }

}
