package pizza;

import java.util.ArrayList;
import java.util.HashMap;

public class Pizza {

    // public static allIngredientsInPizzas = HashMap
    public static HashMap<String, Integer> allIngredients = new HashMap<String, Integer>();

    // public ingredients = hashmap
    public HashMap<String, Integer> ingredients = new HashMap<String, Integer>();

    // static countIngredient
    public static void countIngredient(String i) {
        allIngredients.put(i, allIngredients.get(i)+1);
    }

    // addIngredient(String i) -- call countIngredient()
    public void addIngredient(String [] addedIngredientsPizza){
        for (String i: addedIngredientsPizza) {
            if (ingredients.get(i) == null){
                this.ingredients.put(i, 1);
                if (allIngredients.get(i) == null){
                    allIngredients.put(i, 1);
                } else {
                    countIngredient(i);
                }
            } else {
                this.ingredients.put(i, this.ingredients.get(i)+1);
                countIngredient(i);
            }
        }
    }

    // getPrice() - 2 or < = 15, 3 to 5 = 20, > than 5 = 23
    public Integer getPrice(){
        int qtyIngredient = 0;
        for (Integer qty : this.ingredients.values()){
            qtyIngredient += qty;
        }
        if (qtyIngredient > 0 && qtyIngredient <= 2) {
            return 15;
        } else if (qtyIngredient > 2 && qtyIngredient <= 5) {
            return 20;
        } else if (qtyIngredient > 5){
            return 23;
        } else {
            return 0;
        }
    }

    public HashMap<String, Integer> getIngredients() {
        return ingredients;
    }

    public static void getAllIngredients() {
        for (String i : allIngredients.keySet()){
            System.out.println("Ingredient: " + i + " ----> Quantity: " + allIngredients.get(i));
        }
    }

}
