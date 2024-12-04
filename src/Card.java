public class Card implements Comparable<Card> {
    private int rank;
    private int suit;

    public Card(int input) {
        rank = input / 4 + 1;
        suit = input % 4;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        String suitName = switch (suit) {
            case 0 -> "S";  // Spades
            case 1 -> "H";  // Hearts
            case 2 -> "D";  // Diamonds
            case 3 -> "C";  // Clubs
            default -> "";
        };
        String rankName = switch (rank) {
            case 1 -> "A";  // Ace
            case 11 -> "J"; // Jack
            case 12 -> "Q"; // Queen
            case 13 -> "K"; // King
            default -> String.valueOf(rank);
        };
        return rankName + suitName;
    }

    @Override
    public int compareTo(Card o) {
        // Compare by rank first
        int rankComparison = Integer.compare(this.rank, o.rank);
        if (rankComparison != 0) {
            return rankComparison;  // If ranks are different, return the comparison result
        }

        // If ranks are equal, you could compare by suit as a tiebreaker (optional)
        return Integer.compare(this.suit, o.suit);
    }
}
