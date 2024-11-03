package Birthday_Celebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] vals = scanner.nextLine().split("\\s+");
        List<Citizen> citizenList = new ArrayList<>();
        List<Robot> robots = new ArrayList<>();
        List<Pet> pets = new ArrayList<>();
        while (!vals[0].equals("End")){
            if(vals[0].equals("Robot")) {
                Robot robot = new Robot(vals[1], vals[2]);
                robots.add(robot);
            } else if(vals[0].equals("Citizen")) {
                Citizen citizen = new Citizen(vals[1], Integer.parseInt(vals[2]), vals[3], vals[4]);
                citizenList.add(citizen);
            } else {
                Pet pet = new Pet(vals[1], vals[2]);
                pets.add(pet);
            }

            vals = scanner.nextLine().split("\\s+");
        }

        int year = Integer.parseInt(scanner.nextLine());

        citizenList.forEach(c -> {
            if (c.getBirthDate().endsWith(String.valueOf(year))) {
                System.out.println(c.getBirthDate());
            }
        });

        pets.forEach(pet -> {
            if (pet.getBirthDate().endsWith(String.valueOf(year))) {
                System.out.println(pet.getBirthDate());
            }
        });
    }

}
