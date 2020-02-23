import java.util.Random;
/**
 * This file contains the fields and methods for the Deck class. An instance
 * of this class is used to create a 52-card deck represented by an array
 * of Card objects, another class found in this package.  The subscript field
 * of this class is used to denote a card that represents the top card of the
 * deck, an ability that may come in handy in a number of card games.
 *
 * @author Matthew O'Neill
 * @version 4/18/2019
 */
public class Deck
{
    //subscript represents card at top of deck
    private int subscript;
    //Card array represents traditional 52-card deck
    private Card[] cardArray = new Card[52];
    
     /**
      * This no args constructor sets the subscript field, then creates an
      * array of card objects that represent a standard deck.  This deck is
      * unshuffled and constructed in a structured manner.
      */
    public Deck()
    {
        //assume top of deck is card at array index 0
        this.subscript = 0;
        
        //count corresponds to index value of cards, between 0 and 51
        int count = 0;
        //temporary variable to hold suit
        String tempSuit = "";
        
        //outer loop sets suit
        for(int i = 0; i < 4; i++){
            if(i == 0){
                tempSuit = "Spades";
            }
            else if(i == 1){
                tempSuit = "Clubs";
            }
            else if(i == 2){
                tempSuit = "Hearts";
            }
            else{
                tempSuit = "Diamonds";
            }
            
            //inner loop creates Card objects of all faces
            for(int k = 0; k < 13; k++){
                
                switch(k){
                    case 0:
                        cardArray[count] = new Card(1, tempSuit, "2");
                        break;
                    case 1:
                        cardArray[count] = new Card(2, tempSuit, "3");
                        break;
                    case 2:
                        cardArray[count] = new Card(3, tempSuit, "4");
                        break;
                    case 3:
                        cardArray[count] = new Card(4, tempSuit, "5");
                        break;
                    case 4:
                        cardArray[count] = new Card(5, tempSuit, "6");
                        break;
                    case 5:
                        cardArray[count] = new Card(6, tempSuit, "7");
                        break;
                    case 6:
                        cardArray[count] = new Card(7, tempSuit, "8");
                        break;
                    case 7:
                        cardArray[count] = new Card(8, tempSuit, "9");
                        break;
                    case 8:
                        cardArray[count] = new Card(9, tempSuit, "10");
                        break;
                    case 9:
                        cardArray[count] = new Card(10, tempSuit, "Jack");
                        break;
                    case 10:
                        cardArray[count] = new Card(11, tempSuit, "Queen");
                        break;
                    case 11:
                        cardArray[count] = new Card(12, tempSuit, "King");
                        break;
                    case 12:
                        cardArray[count] = new Card(13, tempSuit, "Ace");
                        break;
                }
                    
                count++;
            }
        }
    }
    
    /**
     * This method prints the contents of the cardArray deck
     */
    public void printDeck()
    {
        //calls .toString() for all cards in array
        for(int i = 0; i < cardArray.length; i++){
            System.out.println(cardArray[i].toString());
        }
    }
    
    /**
     * This method returns a reference to a Card object which corresponds to
     * the top card in the deck, the Card object at the index stored in the
     * subscript field
     * @return Card - reference of a copy of the top card in the deck
     */
    public Card getTopCard()
    {
        //returns card at index of subscript
        this.subscript++;
        return new Card(cardArray[subscript - 1]);
        
    }
    
    /**
     * This method shuffles the cardArray deck by switching the locations
     * of two randomly generated indexes in the array.  This is repeated
     * 1000 times to sufficiently randomize the deck.
     */
    public void shuffle()
    {
        Random rand = new Random();
        //temp variables for switching 2 Cards in array
        int index1;
        int index2;
        Card temp;
        
        //preform 1000 switches to shuffle deck
        for(int i = 0; i < 1000; i++){
            
            //generate random array indexes
            index1 = rand.nextInt(52);
            index2 = rand.nextInt(52);
            
            //switch Card objects
            temp = cardArray[index1];
            cardArray[index1] = cardArray[index2];
            cardArray[index2] = temp;
            
            
        }
    }
    
    /**
     * This get method returns the subscript field.
     * @return int this.subscript - the subscript field
     */
    public int getSubscript()
    {
        return this.subscript;
    }
    
    /**
     * This get method returns the reference to the field cardArray.
     * @return Card[] this.cardArray - reference to array of Card objects
     */
    public Card[] getCardArray()
    {
        return this.cardArray;
    }

}
