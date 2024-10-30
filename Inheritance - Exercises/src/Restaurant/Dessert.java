package Restaurant;

import java.math.BigDecimal;

public class Dessert extends Food{
    public double getCalories() {
        return calories;
    }
    private double calories;
    public Dessert(String name, BigDecimal price, double grams, double calories) {
        super(name, price, grams);
        this.calories = calories;
    }
}
