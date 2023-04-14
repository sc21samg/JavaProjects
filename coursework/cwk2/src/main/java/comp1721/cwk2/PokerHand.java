package comp1721.cwk2;

// Implement PokerHand class here
import java.util.ArrayList;
import java.util.List;

public class PokerHand{

    //creating an arraylist to store a hand of cards
    private List<Card> hand;
    private int cardsInHandSize = 1;

//default constructor that creates an empty hand
public PokerHand(){
     hand = new ArrayList<>();

}

  //importing rank and suit from Card.class
  private Card.Rank rank;
  private Card.Suit suit;


//2nd constructor with a parameter that specifies the cards that should 
//be added to the hand, using 2character abbreviations for the cards
public PokerHand(String cards){

    //the 2nd constructor creates an empty hand
    hand = new ArrayList<>();
    cardsInHandSize = 0;

//adding the rank and suit of the cards in String cards in the hand arraylist
for(int i = 0; i <= cards.length(); i++){

    for (Card.Rank r: Card.Rank.values()) {
      if (r.getSymbol() == cards.charAt(i)) {
           rank = r;  
        break;
      }
    }

            i++;
    for (Card.Suit s: Card.Suit.values()) {
      if (s.getSymbol() == cards.charAt(i)) {
           suit = s;
        break;
      }
    }

    cardsInHandSize++;
    //throwing exception if More than 5 card are added in a hand                        
    //it doesn't work
    if(cardsInHandSize > 5){
        throw new CardException("Trying to add card to a full hand");
    }
    else{
        //throwing exception if there is a dublicate card trying 
        //to be added to the hand                          
        //it doesn't work
        if(hand.contains(cards)){
            throw new CardException("Dublicate card");
        }
        else{
            hand.add(new Card(rank,suit));
        }
    }

    //hand.add(new Card(rank,suit));
    //cardsInHandSize++;
    i++;
   
}
}

//overriding the default version, returns a string in witch cards are shown in 
//2 character form, separated by space: 2d JC 7H
@Override
public String toString(){

    String handAsString = hand.toString();

    handAsString = handAsString.replace("]","");
    handAsString = handAsString.replace("[","");
    return handAsString = handAsString.replace(",","");
}

//returns the no of cards in the hand deck
public int size(){
    return cardsInHandSize;
}

//empties the deck of all its cards
public void discard(){
    hand.remove(0);
    hand.remove(0);
    hand.remove(0);
    hand.remove(0);
    hand.remove(0);
    cardsInHandSize = 0;

}

//empties the hand of cards and returns each of them to the specified deck         
//dosen't work hand is empty idk why
public void discardTo(Deck deck){

   Card value;

 for(int i = 0; i <= hand.size(); i++){
    value = hand.get(0);
     deck.add(value);
     hand.remove(0);
    
 }
}

//predicate methods, indicate the specific type of hand in poker

public boolean isPair(){
    return false;
}

public boolean isTwoPairs(){
    return false;
}


public boolean isThreeOfAKind(){
    return false;
}


public boolean isFourOfAKind(){
    return false;
}

public boolean isFullHouse(){
    return false;
}


public boolean isFlush(){
    return false;
}


public boolean isStraight(){
    return false;
}

public static final int FULL_SIZE = 5;

public void add(Card card){}


    
}
