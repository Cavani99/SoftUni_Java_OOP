package solid.products;

public class Chips extends Food{
    public static  double CALORIES_PER_100_GRAMS;

    public Chips(double kilograms) {
        super(kilograms);
        CALORIES_PER_100_GRAMS = 529.0;
    }
}
