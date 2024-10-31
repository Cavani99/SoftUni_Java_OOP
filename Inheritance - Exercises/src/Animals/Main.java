package Animals;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animal = scanner.nextLine();
        ArrayList<Animal> animals = new ArrayList<>();
         while (!animal.equals("Beast!")){
            String [] fields = scanner.nextLine().split("\\s+");

            switch (animal){
                case "Animal":
                    Animal animal1 = new Animal(fields[0], Integer.parseInt(fields[1]), fields[2]);
                    animals.add(animal1);
                    break;
                case "Cat":
                    Cat cat = new Cat(fields[0], Integer.parseInt(fields[1]), fields[2]);
                    animals.add(cat);
                    break;
                case "Dog":
                    Dog dog = new Dog(fields[0], Integer.parseInt(fields[1]), fields[2]);
                    animals.add(dog);
                    break;
                case "Frog":
                    Frog frog = new Frog(fields[0], Integer.parseInt(fields[1]), fields[2]);
                    animals.add(frog);
                    break;
                case "Kitten":
                    Kitten kitten = new Kitten(fields[0], Integer.parseInt(fields[1]));
                    animals.add(kitten);
                    break;
                case "Tomcat":
                    Tomcat tomcat = new Tomcat(fields[0], Integer.parseInt(fields[1]));
                    animals.add(tomcat);
                    break;
            }

            animal = scanner.nextLine();
        }

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }

    }
}
