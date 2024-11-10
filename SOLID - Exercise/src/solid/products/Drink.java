package solid.products;

public abstract class Drink{
    private double liters;

    public Drink(double liters) {
        this.liters = liters;
    }

    public double getLiters() {
        return liters;
    }
}
