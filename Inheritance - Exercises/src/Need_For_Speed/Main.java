package Need_For_Speed;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(100, 20);

        vehicle.drive(20);
        System.out.println(vehicle.getFuel());

        Car car = new Car(30, 20);

        car.drive(20);
        System.out.println(car.getFuel());

        RaceMotorcycle motorcycle = new RaceMotorcycle(15, 20);

        motorcycle.drive(20);
        System.out.println(motorcycle.getFuel());

        SportCar sportCar = new SportCar(50, 20);

        sportCar.drive(32);
        System.out.println(sportCar.getFuel());

    }
}
