package Cards_With_Power;

public class Card {
    private String rank;

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    private String suit;

    enum Rank {
        ACE(14), TWO(2), THREE(3), FOUR(4),
        FIVE(5), SIX(6), SEVEN(7), EIGHT(8),
        NINE(9), TEN(10), JACK(11), QUEEN(12),KING(13);
        private int size;
        Rank(int size) {
            this.size = size;
        }
        public int getValue() { return this.size; }
    }

    enum Suit {
        CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);
        private int size;
        Suit(int size) {
            this.size = size;
        }
        public int getValue() { return this.size; }
    }

    public int getPower(){
        return Rank.valueOf(rank).getValue() + Suit.valueOf(suit).getValue();
    }

    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }
}
