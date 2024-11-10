package solid.products;

public class Coke extends Drink {

    public static  double CALORIES_PER_100_GRAMS;
    public static double DENSITY;

    public Coke(double liters) {
        super(liters);
        CALORIES_PER_100_GRAMS = 44.0;
        DENSITY = 0.6;
    }
}
