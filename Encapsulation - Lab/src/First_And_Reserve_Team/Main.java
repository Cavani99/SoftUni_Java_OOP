package First_And_Reserve_Team;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        Team team = new Team("Black");
        Person person;
        for (int i = 0; i < num; i++) {
            String [] command = scanner.nextLine().split("\\s+");

            person = new Person(command[0], command[1], Integer.parseInt(command[2]), Double.parseDouble(command[3]));
            team.addPlayer(person);

        }

        System.out.println(String.format("First team have %d players", team.getFirstTeam().size()));
        System.out.println(String.format("Reserve team have %d players", team.getReserveTeam().size()));
    }

}
