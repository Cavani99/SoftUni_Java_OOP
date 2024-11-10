package solid;

import solid.products.Chips;
import solid.products.Chocolate;
import solid.products.Coke;
import solid.products.Lemonade;

import java.util.List;

public class QuantityCalculator extends Printer implements Product {
    @Override
    public double sum(List<Object> products) {
        double sum = 0;

        for (Object product : products) {
            if (product instanceof Coke) {
                double kilograms = ((Coke) product).getLiters() * Coke.DENSITY;
                sum += kilograms;
            }

            if (product instanceof Lemonade) {
                double kilograms = ((Lemonade) product).getLiters() * Coke.DENSITY;
                sum += kilograms;
            }

            if (product instanceof Chocolate) {
                sum += ((Chocolate) product).getKilograms();
            }

            if (product instanceof Chips) {
                sum += ((Chips) product).getKilograms();
            }
        }

        return sum;
    }

    @Override
    public double average(List<Object> products) {
        return sum(products) / products.size();
    }
}
