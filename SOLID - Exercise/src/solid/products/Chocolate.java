package solid.products;

public class Chocolate extends Food{

    public static  double CALORIES_PER_100_GRAMS;

    public Chocolate(double kilograms) {
        super(kilograms);
        CALORIES_PER_100_GRAMS = 575.0;
    }
}
