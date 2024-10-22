package Point_in_Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] rect = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Rectangle rectangle = new Rectangle(rect[0], rect[1], rect[2], rect[3]);

        int points = Integer.parseInt(scanner.nextLine());
        Point point;
        for (int i = 0; i < points; i++) {
            int [] coordinates = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            point = new Point(coordinates[0], coordinates[1]);
            System.out.println(rectangle.contains(point));
        }

    }
}
