package template;

public interface CookDish {
    default void cook(){
        prepareIngredient();
        setCookTemperature();
        insertDish();
        cookDish();
        removeDish();
    }

    void prepareIngredient();
    void setCookTemperature();
    void insertDish();
    void cookDish();
    void removeDish();
}
