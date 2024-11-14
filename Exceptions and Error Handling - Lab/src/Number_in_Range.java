import java.util.Arrays;
import java.util.Scanner;

public class Number_in_Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] range = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(String.format("Range: [%d...%d]", range[0], range[1]));
        while (true){
            String number = scanner.nextLine();
            try {
                int num = Integer.parseInt(number);
                if (num >= range[0] && num <= range[1]) {
                    System.out.println(String.format("Valid number: %s", number));
                    break;
                }
            } catch (NumberFormatException e) {
                //invalid
            }
                System.out.println(String.format("Invalid number: %s", number));
            }
        }
    }

