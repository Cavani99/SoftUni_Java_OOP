package Cards_With_Power;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rank = scanner.nextLine();
        String suit = scanner.nextLine();
        Card card = new Card(rank, suit);

        System.out.println(String.format("Card name: %s of %s; Card power: %d", card.getRank(), card.getSuit(), card.getPower()));
    }
}
