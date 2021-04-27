package composit;

public class Salt extends Ingredient{
    private String howMuch;

    public Salt(double calories, String name, String howMuch) {
        super(calories, name);
        this.howMuch = howMuch;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public String toString() {
        return "Salt{" +
                "howMuch='" + howMuch + '\'' +
                '}';
    }
}
