package solid.products;

public class Lemonade extends Drink {

    public static  double CALORIES_PER_100_GRAMS;
    public static double DENSITY;

    public Lemonade(double liters) {
        super(liters);
        CALORIES_PER_100_GRAMS = 53.0;
        DENSITY = 0.7;
    }
}
