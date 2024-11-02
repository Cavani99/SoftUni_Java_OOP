package Border_Control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] vals = scanner.nextLine().split("\\s+");
        List<Citizen> citizenList = new ArrayList<>();
        List<Robot> robots = new ArrayList<>();
        while (!vals[0].equals("End")){
            if(vals.length == 2) {
                Robot robot = new Robot(vals[0], vals[1]);
                robots.add(robot);
            } else {
                Citizen citizen = new Citizen(vals[0], Integer.parseInt(vals[1]), vals[2]);
                citizenList.add(citizen);
            }

            vals = scanner.nextLine().split("\\s+");
        }

        int fake = Integer.parseInt(scanner.nextLine());

        List <String> result = new ArrayList<>();
        citizenList.forEach(c -> {
            if (c.getId().endsWith(String.valueOf(fake))) {
                System.out.println(c.getId());
            }
        });

        robots.forEach(robot -> {
            if (robot.getId().endsWith(String.valueOf(fake))) {
                System.out.println(robot.getId());
            }
        });
    }



}
