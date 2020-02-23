
/**
 * This method holds the fields and methods for the Card class.  
 * An instance of this class is used to represent a traditional
 * Card from a 52-card deck.  The parameterized constructor can
 * be used to pass in any value for the three fields that the 
 * user wishes.
 *
 * @author Matthew O'Neill
 * @version 4/18/2019
 */
public class Card
{
    //value represents relative value of card, usually between 1 and 13
    private int value;
    private String suit;
    private String face;
    
    /**
     * This no-args constructor sets the fields in the Card class to the
     * default values of 0 and None.
     */
    public Card()
    {
        this.value = 0;
        this.suit = "None";
        this.face = "None";
    }
    
    /**
     * This parameterized constructor sets the values of Card objects to
     * the values passed into the method.
     * @param int inValue - an int between 1 and 13 representing the value
     * of a card, with 2 being the least ad Ace being the highest
     * @param String inSuit - the suit of the card
     * @param String inFace - the face value of the card, between 2 and Ace
     */
    public Card(int inValue, String inSuit, String inFace)
    {
        this.value = inValue;
        this.suit = inSuit;
        this.face = inFace;
    }
    
    /**
     * This copy constructor makes a hard copy of the Card reference passed
     * into the method.
     * @param Card other - the refenence to a Card object to be copied
     */
    public Card(Card other)
    {
        this.value = other.value;
        this.suit = other.suit;
        this.face = other.face;
    }
    
    /**
     * This get method returns the value of the value field.
     * @return int this.Value - the value field
     */
    public int getValue()
    {
        return this.value;
    }
    
    /**
     * This get method returns the value of the suit field.
     * @return String this.suit - the suit field
     */
    public String getSuit()
    {
        return this.suit;
    }
    
    /**
     * This get method returns the calue of the face field.
     * @return String this.face -the face field
     */
    public String getFace()
    {
        return this.face;
    }
    
    /**
     * This method returns a String representation of the card object.
     * @return String - String representation of the card object in the
     * form of "face of suit"
     */
    public String toString()
    {
        return face + " of " + suit;
    }
    
    /**
     * This method compares two Card objects based on their value field,
     * and returns 1 it this is greater, -1 if the one being passed in
     * is greater, and 0 if they are equal
     * @param Card other - reference to Card object being compared
     * @return int - result of comparison based on value field
     */
    public int compareTo(Card other)
    {
        //compares only on the basis of the value field
        if(this.value > other.value){
            return 1;
        }
        else if(other.value > this.value){
            return -1;
        }
        else{
            return 0;
        }
    }
    
    /**
     * This method compares the face and suit fields of two Card objects,
     * and returns true if both are equal and false if they are different.
     * @param Card other - reference to Card object being compared
     * @return boolean - result of the comparison
     */
    public boolean equals(Card other)
    {
        //compares on the basis of both face and suit
        if(this.face.equals(other.face) && this.suit.equals(other.suit)){
            return true;
        }
        else{
            return false;
        }
    }
}
