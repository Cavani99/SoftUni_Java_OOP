package Hotel_Reservation;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String [] command = scanner.nextLine().split("\\s+");
       PriceCalculator priceCalculator = new PriceCalculator(Double.parseDouble(command[0]),
               Integer.parseInt(command[1]),
               command[2],
               command[3]);

        DecimalFormatSymbols separator = new DecimalFormatSymbols(Locale.GERMANY);
        separator.setDecimalSeparator('.');

        DecimalFormat decimalFormat = new DecimalFormat("#.00", separator);


        String formattedPrice = decimalFormat.format(priceCalculator.calculate());
        System.out.println(formattedPrice);

    }
}
