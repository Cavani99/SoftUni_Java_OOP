package Vehicles;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public abstract class Vehicle {
    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    private double fuelQuantity;
    private double fuelConsumption;

    public abstract void refuel(double liters);
    public abstract void drive(double distance);

    public Vehicle(double fuelQuantity, double fuelConsumption){
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumption);
    }

    @Override
    public String toString() {

        return String.format(Locale.US,"%s: %.2f",this.getClass().getSimpleName(), this.getFuelQuantity());
    }
}
