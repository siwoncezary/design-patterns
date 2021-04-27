package composit;

import java.util.List;

public class CompositeDemo {
    public static void main(String[] args) {
        Ingredient sandwich = new Dish("KANAPKA",
                List.of(new Cheese(100, "Ementaler", 50),
                        new Salt(0,"kamienna","szczypta"))
        );
        Ingredient breakfast = new Dish("śniadanko",List.of(sandwich));
        System.out.println(breakfast);
        System.out.println(breakfast.getWeight());
        System.out.println(breakfast.getCalories());
    }
}
