/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args)
    {
        // deck 1
        String[] ranks1 = {"Ace", "Two", "Three", "Four", "Five", "Six",
                            "Seven", "Eight", "Nine", "Ten", "Jack",
                            "Queen", "King" };
        String[] suits1 = {"Spades", "Diamonds", "Hearts", "Clubs" };
        int[] points1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        
        Deck deck1 = new Deck( ranks1, suits1, points1 );
        
        //System.out.println( deck1 );
        // test dealing cards:
        //Card c = deck1.deal();
        //System.out.println( c );
        //System.out.println( deck1.deal() );
        
        
        // deck 2
        String[] ranks2 = {"Pawn", "Rook", "Bishop", "Knight", "Queen", "King"};
        String[] suits2 = {"White", "Black" };
        int[] points2 = { 1, 3, 5, 7, 9, 10 };
        
        Deck deck2 = new Deck( ranks2, suits2, points2 );
        
        deck2.deal();
        
        System.out.println( deck2 );
        
        // deck 3
        
        
    }
}
