package composit;

import java.util.List;

public class Dish extends Ingredient {
    private List<Ingredient> ingredients;

    public Dish(String name, List<Ingredient> ingredients) {
        super(0, name);
        this.ingredients = ingredients;
    }

    @Override
    public double getWeight() {
        return ingredients.stream().mapToDouble(Ingredient::getWeight).sum();
    }

    @Override
    public double getCalories() {
        return ingredients.stream().mapToDouble(Ingredient::getCalories).sum();
    }

    @Override
    public String toString() {
        return "Dish{" +
                "ingredients=" + ingredients +
                '}';
    }
}
