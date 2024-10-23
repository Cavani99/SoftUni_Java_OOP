package Traffic_Lights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] colors = scanner.nextLine().split("\\s+");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < colors.length; j++) {
                int index = (TrafficLight.valueOf(colors[j]).getValue() + i) % 3;
                if(j == colors.length - 1){
                    System.out.print(TrafficLight.getByValue(index).name());
                } else {
                    System.out.print(TrafficLight.getByValue(index).name() + " ");
                }
            }
            System.out.println();
        }
    }
}
