package solid;

import solid.products.Chips;
import solid.products.Chocolate;
import solid.products.Coke;
import solid.products.Lemonade;

import java.util.List;

public class CalorieCalculator extends Printer implements Product {

    public CalorieCalculator() {
    }

    @Override
    public double sum(List<Object> products) {
        double sum = 0;

        for (Object product : products) {
            if (product instanceof Coke) {
                double grams = ((Coke) product).getLiters() * Coke.DENSITY;
                sum += (Coke.CALORIES_PER_100_GRAMS / 100) * grams;
            }

            if (product instanceof Lemonade) {
                double grams = ((Lemonade) product).getLiters() * Lemonade.DENSITY;
                sum += (Lemonade.CALORIES_PER_100_GRAMS / 100) * grams;
            }

            if (product instanceof Chocolate) {
                sum += (Chocolate.CALORIES_PER_100_GRAMS / 100) * ((Chocolate) product).getKilograms();
            }

            if (product instanceof Chips) {
                sum += (Chips.CALORIES_PER_100_GRAMS / 100) * ((Chips) product).getKilograms();
            }
        }

        return sum;
    }

    @Override
    public double average(List<Object> products) {
        return sum(products) / products.size();
    }

}
