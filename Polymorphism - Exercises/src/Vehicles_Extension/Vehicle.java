package Vehicles_Extension;

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

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    private double tankCapacity;

    public abstract void refuel(double liters);
    public abstract void drive(double distance);

    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity){
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumption);
        this.setTankCapacity(tankCapacity);
    }

    @Override
    public String toString() {

        return String.format("%s: %.2f",this.getClass().getSimpleName(), this.getFuelQuantity());
    }
}
