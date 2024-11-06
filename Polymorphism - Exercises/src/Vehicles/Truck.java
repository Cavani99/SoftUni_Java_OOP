package Vehicles;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Truck extends Vehicle{
    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    public void refuel(double liters) {
        double litersLeft = liters * 0.95;
        this.setFuelQuantity(this.getFuelQuantity() + litersLeft);
    }

    @Override
    public void drive(double distance) {
        double consumption = 1.6 + this.getFuelConsumption();

        double fuelLeft = this.getFuelQuantity() - (distance * consumption);
        if(fuelLeft > 0) {
            DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
            symbols.setDecimalSeparator('.');

            DecimalFormat decimalFormat = new DecimalFormat("#.##", symbols);
            this.setFuelQuantity(fuelLeft);
            System.out.println(String.format("Truck travelled %s km", decimalFormat.format(distance)));
        } else {
            System.out.println("Truck needs refueling");
        }
    }
}
