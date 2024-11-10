package solid.products;

public abstract class Food {

    private double kilograms;

    public Food(double kilograms) {
        this.kilograms = kilograms;
    }

    public double getKilograms() {
        return kilograms;
    }
}
