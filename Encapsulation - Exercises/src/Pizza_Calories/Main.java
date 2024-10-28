package Pizza_Calories;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] info = scanner.nextLine().split("\\s+");
        Pizza pizza = new Pizza(info[1], Integer.parseInt(info[2]));

        String [] doughInfo = scanner.nextLine().split("\\s+");
        Dough dough = new Dough(doughInfo[1], doughInfo[2], Double.parseDouble(doughInfo[3]));

        pizza.setDough(dough);
        String [] tops = scanner.nextLine().split("\\s+");
        Topping topping;
        while (!tops[0].equals("END")){
            topping = new Topping(tops[1], Double.parseDouble(tops[2]));
            pizza.addTopping(topping);

            tops = scanner.nextLine().split("\\s+");
        }

        System.out.println(String.format(Locale.US,"%s - %.2f", pizza.getName(), pizza.getOverallCalories()));

    }
}
