
/**
 * This ShuffleDriver class contains a main method and is the driver for
 * a project to play the popular children's card game "War"
 *
 * @author Matthew O'Neill
 * @version 5/3/2019
 */
public class ShuffleDriver

{
    /**
     * This is the main method for the War game.  In this game,
     * cards are compared based on their face value and the player
     * with the higher card is awarded the wagered cards.  The
     * point of the game is to aquire all the cards in the decl
     */
    public static void main(String[] args)
    {
        //create deck object
        Deck deck = new Deck();
      
        deck.shuffle();
        
        //Variables for keeping track of Indexes
        int player1Count = 0;
        int player2Count = 0;
        
        
        int doubleWarMultiple = 1;
        //Make individual decks for each player
        Card[] player1Deck = new Card[52];
        Card[] player2Deck = new Card[52];
        
        for(int i = 0; i < 26; i++){
            player1Deck[i] = deck.getCardArray()[i];
        }
        
        int count = 0;
        for(int i = 26; i < 52; i++){
            player2Deck[count] = deck.getCardArray()[i];
            count++;
        }
        
        //Variables to count the number of cards each player still has
        int player1Wins = 26;
        int player2Wins = 26;
        
        //Actually play the war by going through the 26 cards
        while(player1Count < 26 && player2Count < 26){
            doubleWarMultiple = 1;
            if(player1Deck[player1Count].compareTo(player2Deck[player2Count]) > 0){
                System.out.println("Player 1 has a larger card with a " + player1Deck[player1Count].toString());
                System.out.println("Player 2 has a " + player2Deck[player2Count].toString());
                System.out.println("-------------------------------------");
                //Increment and decrement index and card number
                player1Wins++;
                player2Wins--;
                player1Count++;
                player2Count++;
            }
            else if(player2Deck[player2Count].compareTo(player1Deck[player1Count]) > 0){
                System.out.println("Player 2 has a larger card with a " + player2Deck[player2Count].toString());
                System.out.println("Player 1 has a " + player1Deck[player1Count].toString());
                System.out.println("-------------------------------------");
                //Increment and decrement index and card number
                player2Wins++;
                player1Wins--;
                player1Count++;
                player2Count++;
            }
            else{
                //War
                System.out.println("War Time!!!");
                if(player1Count < 21 && player2Count < 21){
                    
                    System.out.println("Player 1 Cards:");
                    System.out.println(player1Deck[player1Count]);
                    System.out.println(player1Deck[++player1Count]);
                    System.out.println(player1Deck[++player1Count]);
                    System.out.println(player1Deck[++player1Count]);
                    System.out.println(player1Deck[++player1Count]);
                    
                    System.out.println("Player 2 Cards:");
                    System.out.println(player2Deck[player2Count]);
                    System.out.println(player2Deck[++player2Count]);
                    System.out.println(player2Deck[++player2Count]);
                    System.out.println(player2Deck[++player2Count]);
                    System.out.println(player1Deck[++player1Count]);
                    
                    if(player1Deck[player1Count].compareTo(player2Deck[player2Count]) > 0){
                        System.out.println("Player 1 Wins War!");
                        player1Wins = (player1Wins + 5) * doubleWarMultiple;
                        player2Wins = (player2Wins - 5) * doubleWarMultiple;
                    }
                    else if(player2Deck[player2Count].compareTo(player1Deck[player1Count]) > 0){
                        System.out.println("Player 2 Wins War");
                        player2Wins = player2Wins + 5;
                        player2Wins = player2Wins - 5;
                    }
                    else{
                        //multiply card indexes if in double war
                        System.out.println("Double War!!");
                        doubleWarMultiple++;
                    }
                    
                    System.out.println("----------------");
                }
                
                    
                else{
                    player1Count++;
                    player2Count++; 
                }
                
            }
        }
        System.out.println("Final Card Count: ");
        System.out.println("---------");
        System.out.println("Player 1 Cards: " + player1Wins);
        System.out.println("Player 2 Cards: " + player2Wins);
        System.out.println("---------");
        System.out.println("The game is over");

    }
}
