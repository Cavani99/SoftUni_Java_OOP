import java.util.ArrayList;
import java.util.Scanner;

public class Enter_Numbers {

    public static ArrayList<Integer> readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (numbers.size() < 10){
            try {
                int num = Integer.parseInt(scanner.nextLine());
                if(num <= start || num >= end) {
                    System.out.println(String.format("Your number is not in range %d - %d!", start, end));
                } else {
                    start = num;
                    numbers.add(num);
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid Number!");
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = readNumber(1, 100);

        System.out.println(String.join(", ", list.toString()
                .replaceAll("\\[", "")
                .replaceAll("]", "")));
    }
}
