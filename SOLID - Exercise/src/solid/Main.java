package solid;

import solid.products.Chips;
import solid.products.Chocolate;
import solid.products.Coke;
import solid.products.Lemonade;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CalorieCalculator calorieCalculator = new CalorieCalculator();
        QuantityCalculator quantityCalculator = new QuantityCalculator();

        Chips chips = new Chips(10);
        Chocolate chocolate = new Chocolate(0.5);
        Coke coke = new Coke(2);
        Lemonade lemonade = new Lemonade(1);

        List<Object> products = new ArrayList<>();
        products.add(chips);
        products.add(chocolate);
        products.add(coke);
        products.add(lemonade);

        System.out.println(calorieCalculator.sum(products));
        System.out.println(quantityCalculator.sum(products));

        calorieCalculator.printSum(products);
        calorieCalculator.printAverage(products);

        quantityCalculator.printSum(products);
        quantityCalculator.printAverage(products);
    }
}
