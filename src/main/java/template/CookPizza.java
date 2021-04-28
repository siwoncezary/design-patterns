package template;

public class CookPizza implements CookDish{

    @Override
    public void prepareIngredient() {
        System.out.println("Prepare ingredient: Cake, Cheese, Tomato Souse, Herbs");
    }

    @Override
    public void setCookTemperature() {
        System.out.println("Setting 150 C degrees");
    }

    @Override
    public void insertDish() {
        System.out.println("Insert Pizza into cooker");
    }

    @Override
    public void cookDish() {
        System.out.println("Cook 15-20 minutes");
    }

    @Override
    public void removeDish() {
        System.out.println("Remove Pizza from cooker");
    }
}
