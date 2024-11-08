package Vehicles_Extension;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Car extends Vehicle {
    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void refuel(double liters) {
        if (liters <= 0) {
            System.out.println("Fuel must be a positive number");
        } else if (this.getTankCapacity() < this.getFuelQuantity() + liters) {
            System.out.println("Cannot fit fuel in tank");
        } else {
            this.setFuelQuantity(this.getFuelQuantity() + liters);
        }
    }

    @Override
    public void drive(double distance) {
        double consumption = 0.9 + this.getFuelConsumption();

        double fuelLeft = this.getFuelQuantity() - (distance * consumption);
        if(fuelLeft > 0) {
            DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
            symbols.setDecimalSeparator('.');

            DecimalFormat decimalFormat = new DecimalFormat("#.##", symbols);
            this.setFuelQuantity(fuelLeft);
            System.out.println(String.format("Car travelled %s km", decimalFormat.format(distance)));
        } else {
            System.out.println("Car needs refueling");
        }

    }
}
