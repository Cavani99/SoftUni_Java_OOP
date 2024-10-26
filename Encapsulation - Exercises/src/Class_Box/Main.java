package Class_Box;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double l = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        Box box = new Box(l, w, h);
        System.out.println(String.format(Locale.US, "Surface Area - %.2f", box.calculateSurfaceArea()));
        System.out.println(String.format(Locale.US, "Lateral Surface Area - %.2f", box.calculateLateralSurfaceArea()));
        System.out.println(String.format(Locale.US, "Volume - %.2f", box.calculateVolume()));
    }
}
