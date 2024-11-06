package WildFarm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] animal = scanner.nextLine().split("\\s+");

        ArrayList <Animal> animals = new ArrayList<>();
        while (!animal[0].equals("End")){
            String [] food = scanner.nextLine().split("\\s+");
            Food foodClass;
            if(food[0].equals("Vegetable")){
                foodClass = new Vegetable(Integer.parseInt(food[1]));
            } else {
                foodClass = new Meat(Integer.parseInt(food[1]));
            }

            Animal animalClass;
            switch (animal[0]){
                case "Cat":
                    animalClass = new Cat(animal[1],
                            animal[0],
                            Double.parseDouble(animal[2]),
                            animal[3],
                            animal[4]);
                    break;
                case "Tiger":
                    animalClass = new Tiger(animal[1],
                            animal[0],
                            Double.parseDouble(animal[2]),
                            animal[3]);
                    break;
                case "Zebra":
                    animalClass = new Zebra(animal[1],
                            animal[0],
                            Double.parseDouble(animal[2]),
                            animal[3]);
                    break;
                default:
                    animalClass = new Mouse(animal[1],
                            animal[0],
                            Double.parseDouble(animal[2]),
                            animal[3]);
                    break;
            }

            animalClass.makeSound();
            animalClass.eat(foodClass);
            animals.add(animalClass);

            animal = scanner.nextLine().split("\\s+");
        }

        for (Animal animal1 : animals) {
            System.out.println(animal1);
        }
    }
}
