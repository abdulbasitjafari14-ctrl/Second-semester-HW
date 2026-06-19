package deckcard;
public class DeckCard {
    public static void main(String[] args) {
        
        int[] Deck = new int[52];
        for(int i = 0; i<Deck.length; i++)
            Deck[i] = i;
        
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
        for(int i = 0; i<Deck.length; i++)
        {
            int randomIndex = (int)(Math.random()*Deck.length);
            int temp = Deck[i];
            Deck[i] = Deck[randomIndex];
            Deck[randomIndex] = temp;
        }
        
        for(int i = 0; i<4; i++)
        {
            String suit = suits[Deck[i]/13];
            String rank = ranks[Deck[i]%13];
            System.out.println("Card Number "+Deck[i]+" : "+rank+" of "+suit);
        }
        
    }
    
}
