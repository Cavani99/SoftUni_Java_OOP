package Vehicles_Extension;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] carValues = scanner.nextLine().split("\\s+");
        Car car = new Car(Double.parseDouble(carValues[1]),Double.parseDouble(carValues[2]), Integer.parseInt(carValues[3]));

        String [] truckValues = scanner.nextLine().split("\\s+");
        Truck truck = new Truck(Double.parseDouble(truckValues[1]),Double.parseDouble(truckValues[2]), Integer.parseInt(truckValues[3]));

        String [] busValues = scanner.nextLine().split("\\s+");
        Bus bus = new Bus(Double.parseDouble(busValues[1]),Double.parseDouble(busValues[2]), Integer.parseInt(busValues[3]));

        int commands = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < commands; i++) {
            String [] command = scanner.nextLine().split("\\s+");

            if(command[0].equals("Drive")){
                if(command[1].equals("Car")){
                    car.drive(Double.parseDouble(command[2]));
                } else if(command[1].equals("Truck")) {
                    truck.drive(Double.parseDouble(command[2]));
                } else if(command[1].equals("Bus")) {
                    bus.driveWithPeople(Double.parseDouble(command[2]));
                }
            } else if(command[0].equals("DriveEmpty")) {
                if(command[1].equals("Bus")){
                    bus.drive(Double.parseDouble(command[2]));
                }
            } else if(command[0].equals("Refuel")) {
                if(command[1].equals("Car")){
                    car.refuel(Double.parseDouble(command[2]));
                } else if(command[1].equals("Truck")) {
                    truck.refuel(Double.parseDouble(command[2]));
                } else if(command[1].equals("Bus")) {
                    bus.refuel(Double.parseDouble(command[2]));
                }
            }
        }

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }
}
