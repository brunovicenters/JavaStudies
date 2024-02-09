import pizza.Pizza;
import pizza.ShoppingCart;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ShoppingCart sp = new ShoppingCart();

        Pizza p = new Pizza();

        Pizza p1 = new Pizza();

        Pizza p2 = new Pizza();

        Pizza p3 = new Pizza();


        p.addIngredient(new String[]{"Pepperoni", "Cheese"});

        p1.addIngredient(new String[]{"Chocolate"});

        p2.addIngredient(new String[]{"Catupiry", "Chicken", "Corn"});

        p3.addIngredient(new String[]{"Pepperoni", "Pepperoni", "Pepperoni", "Tomato", "Cheese"});

        sp.addPizza(p);
        sp.addPizza(p1);
        sp.addPizza(p2);
        sp.addPizza(p3);

        System.out.println("Pizza 1: "+p.getPrice());
        System.out.println("Pizza 2: "+p1.getPrice());
        System.out.println("Pizza 3: "+p2.getPrice());
        System.out.println("Pizza 4: "+p3.getPrice());
        System.out.println("Total: "+sp.totalPrice());
        Pizza.getAllIngredients();
    }
}