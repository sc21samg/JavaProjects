package comp1721.cwk2;

// Implement Deck class here

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;


public class Deck{

   //storing a full deck of cards in the deck arraylist
   private List<Card> deck = new ArrayList<>();
   //initialising a variable to count the cards in the deck
   private int cardsInDeckSize = 0;

//default constructor for deck containing 52 cards, 
//arranged by 4 suits, and 13 rank order
public Deck(){

//getting the values of ranks and suits from the Card.class
Card.Rank[] ranks = Card.Rank.values();
Card.Suit[] suits = Card.Suit.values();

//adding each card to the deck && the counter is increasing
for(Card.Suit s: suits){
    for(Card.Rank r: ranks){
        deck.add(new Card(r,s));
      
        cardsInDeckSize++;
        
    }
}

//throwing exception if we are dealing with an empty deck                   
//it doesn't work yet
if(deck.size() == 0){
        throw new CardException("Empty deck");
    }

}
//deck.deal() == 0

public void add(Card card){
    deck.add(card);
}

//returns the number of cards in the deck
public int size(){

    if(deck.isEmpty() == true){
        return 0;
    }
    else{
        return cardsInDeckSize;
    }
    
}

//returns true if the deck is empty, false otherwise
public boolean isEmpty(){
    if(deck.size() == 0){
        return true;
    }
    else{
        return false;
    }
}

//returns true if the deck contains the specified card, false otherwise
public boolean contains(Card Card){
   
    if(deck.contains(Card) == true){
        return true;
    }
    else{
        return false;
    }

}

//empties the deck of all its cards
public void discard(){
    deck.clear();

}

//removes the first card in the deck and returns it
public Card deal(){

    Card value = deck.get(0);
    deck.remove(0);
    return value;
}


//rearranges cards in the deck randomly
public void shuffle(){
    Collections.shuffle(deck);
}


}

