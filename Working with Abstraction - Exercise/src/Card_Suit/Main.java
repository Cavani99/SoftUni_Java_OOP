package Card_Suit;

import java.util.Scanner;

public class Main {
    enum Cards {
        CLUBS(0), DIAMONDS(1), HEARTS(2), SPADES(3);
        private int size;
        Cards(int size) {
            this.size = size;
        }
        public int getValue(int i) {
            return this.size;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String val = scanner.nextLine();

        if(val.equals("Card Suits")){
            System.out.println("Card Suits:");
            for (Cards card : Cards.values()) {
                System.out.println(String.format("Ordinal value: %d; Name value: %s", card.ordinal(), card.name()));
            }
        }

    }
}
