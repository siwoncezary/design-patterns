package composit;

public class Cheese extends Ingredient{
    private double weight;

    public Cheese(double calories, String name, double weight) {
        super(calories, name);
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "weight=" + weight +
                '}';
    }
}
