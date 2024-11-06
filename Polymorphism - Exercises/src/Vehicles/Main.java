package Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] carValues = scanner.nextLine().split("\\s+");
        Car car = new Car(Double.parseDouble(carValues[1]),Double.parseDouble(carValues[2]));

        String [] truckValues = scanner.nextLine().split("\\s+");
        Truck truck = new Truck(Double.parseDouble(truckValues[1]),Double.parseDouble(truckValues[2]));

        int commands = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < commands; i++) {
            String [] command = scanner.nextLine().split("\\s+");

            if(command[0].equals("Drive")){
                if(command[1].equals("Car")){
                    car.drive(Double.parseDouble(command[2]));
                } else {
                    truck.drive(Double.parseDouble(command[2]));
                }
            } else {
                if(command[1].equals("Car")){
                    car.refuel(Double.parseDouble(command[2]));
                } else {
                    truck.refuel(Double.parseDouble(command[2]));
                }
            }
        }

        System.out.println(car);
        System.out.println(truck);
    }
}
