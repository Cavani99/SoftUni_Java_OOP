package Card_Rank;

import java.util.Scanner;

public class Main {
    enum Cards {
        ACE(0), TWO(1), THREE(2), FOUR(3),
        FIVE(4), SIX(5), SEVEN(6), EIGHT(7),
        NINE(8), TEN(9), JACK(10), QUEEN(11),KING(12);
        private int size;
        Cards(int size) {
            this.size = size;
        }
        public int getValue() { return this.size; }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String val = scanner.nextLine();

        if(val.equals("Card Ranks")){
            System.out.println("Card Ranks:");
            for (Cards card : Cards.values()) {
                System.out.println(String.format("Ordinal value: %d; Name value: %s", card.ordinal(), card.name()));
            }
        }

    }
}
