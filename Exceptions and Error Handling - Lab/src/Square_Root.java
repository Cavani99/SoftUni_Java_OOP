import java.util.Locale;
import java.util.Scanner;

public class Square_Root {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        try {
            int num = Integer.parseInt(number);
            double sqrtNum = Math.sqrt(num);
            if(num <= 0){
                throw new NumberFormatException("Invalid");
            }
            System.out.println(String.format(Locale.US,"%.2f", sqrtNum));
        } catch (NumberFormatException e){
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");
        }
    }
}
