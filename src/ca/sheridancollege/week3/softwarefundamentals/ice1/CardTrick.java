/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagami
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            public static void main(String[] args){
                
    Scanner input = new Scanner(System.in);
    String suits[] = {"H", "D", "C", "S"};
    String cards[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                      "J", "Q", "K", "A" };
    Random random = new Random();
    System.out.println(cards[random.nextInt(cards.length)]
        + suits[random.nextInt(suits.length)]);
}
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
