package composit;

abstract public class Ingredient {
    private double calories;
    private String name;

    public Ingredient(double calories, String name) {
        this.calories = calories;
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    abstract public double getWeight();
}
